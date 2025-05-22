package curdclass;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DatabseConnection;

public class CURDClass {

    public static DatabseConnection dc = new DatabseConnection();
    public static PreparedStatement ps;
    public static String sql = "";

    public static void main(String[] args) {
        saveStudent("Eiasin Prodhan", 10);
        System.err.println("After Insert");
        viewStudent();
        
        updateStudent(1, "Foysal Ahmed", 5);
        System.err.println("After Update");
        viewStudent();

        deleteStudent(1);
        System.err.println("After Delete");
         viewStudent();

    }

    public static void saveStudent(String name, int classIn) {
        sql = "insert into studentdetails(name, classIn)values(?,?)";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, classIn);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
            System.out.println("Student added successfully.");
        } catch (SQLException ex) {
            System.err.println("Studebt not added.");
        }

    }

    public static void viewStudent() {
        sql = "select * from studentdetails";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                int classIn = rs.getInt("classIn");

                System.out.println("Roll: " + roll
                        + "\nName: " + name
                        + "\nClass: " + classIn
                        + "\n------------------------------"
                );
            }
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURDClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateStudent(int roll, String name, int classIn) {
        sql = "update studentdetails set name=?, classIn=? where roll=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, classIn);
            ps.setInt(3, roll);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURDClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteStudent(int roll) {
        sql = "delete from studentdetails where roll=?";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ps.setInt(1, roll);
            ps.executeUpdate();
            ps.close();
            dc.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CURDClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
