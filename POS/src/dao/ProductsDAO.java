package dao;

import entity.Category;
import entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class ProductsDAO {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    CategoryDao cd = new CategoryDao();

    public void loadCategoryToProduct(JComboBox<String> catList) {
        catList.removeAllItems();
        List<Category> categories = new ArrayList<>();
        categories = cd.getAllCategory();

        for (Category category : categories) {
            catList.addItem(category.getName());
        }

    }

    public void getAllProductsByCategory(String category, JComboBox comboBox) {
        List<Product> products = new ArrayList<>();

        sql = "select * from products where category=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, category);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                products.add(new Product(id, name, category));
            }

            comboBox.removeAllItems();

            for (Product product : products) {
                comboBox.addItem(product.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void saveProduct(String name, String category) {
        sql = "insert into products(name, category)values(?, ?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showAllProducts(JTable jt) {
        String[] columnName = {"ID", "Product Name", "Category"};
        DefaultTableModel tableModel = new DefaultTableModel(columnName, 0);
        jt.setModel(tableModel);

        sql = "select * from products";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String category = rs.getString("category");

                Object[] rowData = {id, name, category};
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
