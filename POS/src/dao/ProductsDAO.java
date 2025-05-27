package dao;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import util.DBUtil;


public class ProductsDAO {
    DBUtil du = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    
    CategoryDao cd = new CategoryDao();
    
    public void loadCategoryToProduct(JComboBox<String> catList){
        catList.removeAllItems();
        List<Category> categories = new ArrayList<>();
        categories = cd.getAllCategory();
        
        for(Category category : categories){
            catList.addItem(category.getName());
        }
        
    }
    
}
