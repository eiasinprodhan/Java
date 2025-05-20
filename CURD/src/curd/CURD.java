package curd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DatabseConnection;

public class CURD {

    public static DatabseConnection dc = new DatabseConnection();
    public static PreparedStatement ps;
    public static String sql = "";

    public static void main(String[] args) {
        saveEmployee("Eiasin Prodhan", "eiasinprodhan@gmail.com", "01888118271", 1000000f);
        saveEmployee("Parvej Hossain", "parvejhossain@gmail.com", "01886598487", 100f);
        System.out.println("After Insert");
        viewEmployee();

        updateEmployee(2, "Parvej Hossain", "parvejhossain@gmail.com", "01886598487", 1000000f);
        System.out.println("After Update");
        viewEmployee();
        
        deleteEmployee(2);
        System.out.println("After Delete");
        viewEmployee();

    }

    public static void saveEmployee(String name, String email, String phone, float salary) {
        sql = "insert into employee(name, email, phone, salary)values(?,?,?,?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setFloat(4, salary);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            System.out.println("Data inserted successfully.");
        } catch (SQLException ex) {
            System.err.println("Data inserting unsuccessful.");
        }

    }

    public static void viewEmployee() {
        sql = "select * from employee";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                float salary = rs.getFloat("salary");
                System.out.println("ID: " + id
                        + "\nName: " + name
                        + "\nEmail: " + email
                        + "\nPhone: " + phone
                        + "\nSalary: " + salary
                        + "\n------------------------------"
                );
            }
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateEmployee(int id, String name, String email, String phone, float salary) {
        sql = "update employee set name=?, email=?, phone=?, salary=? where id=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setFloat(4, salary);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmployee(int id) {
        sql = "delete from employee where id=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
