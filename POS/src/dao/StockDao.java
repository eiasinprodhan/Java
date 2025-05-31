package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class StockDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    public void saveStock(String name, String category) {
        sql = "insert into stock(name, category, quantity)values(?, ?, ?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setFloat(3, 0);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showStock(JTable jt) {
        String[] columnRow = {"ID", "Product Name", "Category", "Quantity"};
        DefaultTableModel tableModel = new DefaultTableModel(columnRow, 0);
        jt.setModel(tableModel);

        sql = "Select * from stock";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String category = rs.getString("category");
                Float quantity = rs.getFloat("quantity");
                Object[] rowData = {id, name, category, quantity};
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateStock(String productName, float quantity) {
        sql = "update stock set quantity = quantity + ? where name=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setFloat(1, quantity);
            ps.setString(2, productName);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
