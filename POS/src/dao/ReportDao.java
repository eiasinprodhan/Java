package dao;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entity.Purchase;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class ReportDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    CategoryDao cd = new CategoryDao();
    StockDao sd = new StockDao();

    public List<Purchase> purchaseReportByDate(Date from, Date to, JTable jt) {
        List<Purchase> purchaseList = new ArrayList<>();

        String[] columnName = {
            "Product Name",
            "Category",
            "Supplier",
            "Unit Price",
            "Quantity",
            "Total Price",
            "Date"};
        DefaultTableModel tableModel = new DefaultTableModel(columnName, 0);
        jt.setModel(tableModel);

        sql = "select * from purchase where dateAndTime between ? and ?";

        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setDate(1, from);
            ps.setDate(2, to);
            rs = ps.executeQuery();

            while (rs.next()) {
                Purchase purchase = new Purchase(
                        rs.getString("category"),
                        rs.getString("name"),
                        rs.getString("supplier"),
                        rs.getFloat("unitPrice"),
                        rs.getFloat("quantity"),
                        rs.getFloat("totalPrice"),
                        rs.getDate("dateAndTime"));
                purchaseList.add(purchase);

                Object[] rowData = {
                    purchase.getName(),
                    purchase.getCategory(),
                    purchase.getSupplier(),
                    purchase.getUnitPrice(),
                    purchase.getQuantity(),
                    purchase.getTotaltPrice(),
                    purchase.getDateAndTime()
                };
                tableModel.addRow(rowData);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchaseList;
    }

    public void generatePDFReportForPurchase(Date from, Date to, JTable jt) {
        try {
            List<Purchase> purchases = purchaseReportByDate(from, to, jt);

            Document document = new Document(PageSize.A4);
            LocalDate currentDate = LocalDate.now();
            String filePath = "Purchase Report.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 15);
            Paragraph title = new Paragraph("Purchase Report", titleFont);
            title.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(title);

            document.add(new Paragraph("\n"));

            PdfPTable table = new PdfPTable(7);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            //set table colum widths
            float[] columWidths = {2.5f, 2.5f, 2.5f, 2.5f, 2.5f, 2.5f, 2.5f};
            table.setWidths(columWidths);

            String[] headers = {"Product Name", "Unit Price", "Quantity", "Total Price", "Category", "Supplier", "Date"};
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);

            for (String header : headers) {

                PdfPCell headerCell = new PdfPCell(new Phrase(header, headerFont));
                headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                headerCell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(headerCell);
            }
            
            Font dataFont = FontFactory.getFont(FontFactory.HELVETICA, 10);
                for (Purchase p : purchases) {

                    table.addCell(new PdfPCell(new Phrase(p.getName(), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10))));
                    table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getUnitPrice()), dataFont)));
                    table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getQuantity()), dataFont)));
                    table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getTotaltPrice()), dataFont)));
                    table.addCell(new PdfPCell(new Phrase(p.getCategory(), dataFont)));
                    table.addCell(new PdfPCell(new Phrase(p.getSupplier(), dataFont)));
                    table.addCell(new PdfPCell(new Phrase(p.getDateAndTime().toString(), dataFont)));
                }

            //Add table to the document
            document.add(table);

            document.close();

            JOptionPane.showMessageDialog(null, "Purchase Report Generated");

        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
