package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class SalesDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    public void showSales(JTable jt) {
        String[] columnName = {"ID", "Product Name", "Category", "Customer Name", "Unit Price", "Quantity", "Total Price", "Sell Date"};
        DefaultTableModel tableModel = new DefaultTableModel(columnName, 0);
        jt.setModel(tableModel);
        sql = "select * from sales";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String category = rs.getString("category");
                String productName = rs.getString("productName");
                String customerName = rs.getString("customerName");
                Float unitPrice = rs.getFloat("unitPrice");
                Float quantity = rs.getFloat("quantity");
                Float totalPrice = rs.getFloat("totalPrice");
                Date dateAndTime = rs.getDate("dateAndTime");
                Object[] rowData = {id, productName, category, customerName, unitPrice, quantity, totalPrice, dateAndTime};
                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void saveSales(String category, String productName, String customerName, float unitPrice, float quantity, float totalPrice) {
        sql = "insert into sales(category, productName, customerName, unitPrice, quantity, totalPrice, dateAndTime)values(?, ?, ?, ?, ?, ?, now())";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, category);
            ps.setString(2, productName);
            ps.setString(3, customerName);
            ps.setFloat(4, unitPrice);
            ps.setFloat(5, quantity);
            ps.setFloat(6, totalPrice);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateStock(String productName, float quantity) {
        sql = "update stock set quantity = quantity - ? where name=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setFloat(1, quantity);
            ps.setString(2, productName);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Float checkStock(String productName) {
        Float quantity = 0f;
        sql = "select quantity from stock where name=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, productName);
            rs = ps.executeQuery();
            while(rs.next()){
                quantity = rs.getFloat("quantity");
            }
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantity;
    }
}
