package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class PurchaseDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    public void savePurchase(String category, String name, String supplier, float unitPrice, float quantity, float totalPrice) {
        sql = "insert into purchase(category, name, supplier, unitPrice, quantity, totalPrice, dateAndTime)values(?,?,?,?,?,?,NOW())";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, category);
            ps.setString(2, name);
            ps.setString(3, supplier);
            ps.setFloat(4, unitPrice);
            ps.setFloat(5, quantity);
            ps.setFloat(6, totalPrice);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showPurchase(JTable jt) {
        String[] columnName = {"ID", "Product Name", "Category", "Supplier", "Unit Price", "Quantity", "Total Price", "Puchase Date"};
        DefaultTableModel tableModel = new DefaultTableModel(columnName, 0);
        jt.setModel(tableModel);
        sql = "select * from purchase";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String category = rs.getString("category");
                String name = rs.getString("name");
                String supplier = rs.getString("supplier");
                Float unitPrice = rs.getFloat("unitPrice");
                Float quantity = rs.getFloat("quantity");
                Float totalPrice = rs.getFloat("totalPrice");
                Date dateAndTime = rs.getDate("dateAndTime");
                Object[] rowData = {id, name, category, supplier, unitPrice, quantity, totalPrice, dateAndTime};
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
