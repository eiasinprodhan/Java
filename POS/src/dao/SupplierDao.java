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

public class SupplierDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;

    public void saveSupplier(String name, String email, String cell, String contactPerson) {
        String sql = "INSERT INTO suppliers(name, email, cell, contactPerson)VALUES(?,?,?,?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, contactPerson);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();

            JOptionPane.showMessageDialog(null, "Customer saved successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer not saved.");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showSuppliers(JTable jt) {
        String[] columnsName = {"ID", "Name", "Email", "Phone", "Contact Person"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "SELECT * FROM suppliers";

        try {
            ps = dc.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("cell");
                String contactPerson = rs.getString("contactPerson");

                Object[] rowData = {id, name, email, phone, contactPerson};
                tableModel.addRow(rowData);
            }
            rs.close();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showSuppliersById(JTable jt, int id) {
        String[] columnsName = {"ID", "Name", "Email", "Phone", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "SELECT * FROM suppliers where id=?";

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
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showSuppliersByAddress(JTable jt, String address) {
        String[] columnsName = {"ID", "Name", "Email", "Phone", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "SELECT * FROM suppliers where address=?";

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
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editSupplier(int id, String name, String email, String phone, String address) {
        String sql = "UPDATE suppliers SET name=?, email=?, cell=?, address=? WHERE id=?";
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
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteSupplier(int id) {
        String sql = "DELETE FROM suppliers WHERE id=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            JOptionPane.showMessageDialog(null, "Customer deleted successfully.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer not deleted.");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
