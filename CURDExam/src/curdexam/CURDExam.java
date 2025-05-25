package curdexam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DatabaseConnection;

public class CURDExam {

    public static DatabaseConnection dc = new DatabaseConnection();
    public static PreparedStatement ps;
    public static String sql = "";

    public static void main(String[] args) {
        System.out.println("----------After Insert----------");
        saveEmployee("Eiasin Prodhan", "CEO", 1000000f);
        saveEmployee("Parvej Hossain", "Senior Developer", 1000000f);
        viewEmployee();

        System.out.println("");
        System.out.println("----------After Update----------");
        updateEmployee(2, "Rakib Islam", "Junior Developer", 500000f);
        viewEmployee();

        System.out.println("");
        System.out.println("----------After Delete----------");
        deleteEmployee(2);
        viewEmployee();
    }

    public static void saveEmployee(String name, String designation, float salary) {
        sql = "insert into employee(name, designation, salary)values(?,?,?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            System.out.println("Employee added successfully.");
        } catch (SQLException ex) {
            System.err.println("Employee adding failed");
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
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                System.out.println("ID: " + id
                        + ", Name: " + name
                        + ", Designation: " + designation
                        + ", Salary: " + salary
                );
            }
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURDExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateEmployee(int id, String name, String designation, float salary) {
        sql = "update employee set name=?, designation=?, salary=? where id=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            System.out.println("Employee no. " + id + " updated successfully.");
        } catch (SQLException ex) {
            System.err.println("Employee no. " + id + " updating failed.");
            Logger.getLogger(CURDExam.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.println("Employee no. " + id + " deleted successfully.");
        } catch (SQLException ex) {
            System.err.println("Employee no. " + id + " deleting failed.");
            Logger.getLogger(CURDExam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
