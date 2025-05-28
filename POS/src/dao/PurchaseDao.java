package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;


public class PurchaseDao {
    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    public void savePurchase(String category, String name, String supplier, float unitPrice, float quantity, float totaltPrice){
        sql = "insert into purchase(category, name, supplier, unitPrice, quantity, totaltPrice, dateAndTime)values(?,?,?,?,?,?,NOW())";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, category);
            ps.setString(2, name);
            ps.setString(3, supplier);
            ps.setFloat(4, unitPrice);
            ps.setFloat(5, quantity);
            ps.setFloat(6, totaltPrice);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
