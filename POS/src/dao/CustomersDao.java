package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;

public class CustomersDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;

    public void saveCustomer(String name, String email, String phone, String address) {
        String sql = "INSERT INTO customer(name, cell, email, address)VALUES(?,?,?,?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();

            JOptionPane.showMessageDialog(null, "Customer saved successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer not saved.");
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showCustomers(JTable jt) {
        String[] columnsName = {"ID", "Name", "Email", "Phone", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "SELECT * FROM customer";

        try {
            ps = dc.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("cell");
                String address = rs.getString("address");

                Object[] rowData = {id, name, email, phone, address};
                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showCustomersById(JTable jt, int id) {
        String[] columnsName = {"ID", "Name", "Email", "Phone", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "SELECT * FROM customer where id=?";

        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("cell");
                String address = rs.getString("address");

                Object[] rowData = {id, name, email, phone, address};
                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showCustomersByAddress(JTable jt, String address) {
        String[] columnsName = {"ID", "Name", "Email", "Phone", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "SELECT * FROM customer where address=?";

        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, address);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String phone = rs.getString("cell");
                    String address1 = rs.getString("address");

                    Object[] rowData = {id, name, email, phone, address1};
                    tableModel.addRow(rowData);
                }

            rs.close();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editCustomer(int id, String name, String email, String phone, String address) {
        String sql = "UPDATE customer SET name=?, email=?, cell=?, address=? WHERE id=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            JOptionPane.showMessageDialog(null, "Customer edited successfully.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer not edit.");
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteCustomer(int id) {
        String sql = "DELETE FROM customer WHERE id=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            JOptionPane.showMessageDialog(null, "Customer deleted successfully.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer not deleted.");
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
