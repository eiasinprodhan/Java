package dao;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class CategoryDao {
    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    Category category = new Category();
    
    public void saveCategory(String name){
        sql = "insert into category(name)values(?)";
        try {
            ps = dc.getConnection().prepareCall(sql);
            ps.setString(1, name);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showCategory(JTable jt){
        String[] columnName = {"ID", "Name"};
        DefaultTableModel tableModel = new DefaultTableModel(columnName,0);
        jt.setModel(tableModel);
        sql = "select * from category order by id";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                Object[] rowData= {id, name};
                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
