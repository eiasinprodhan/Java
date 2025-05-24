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
        System.out.println("-----After Insert-----");
        saveStudent("Eiasin Prodhan", 10);
        showStudent();
        
        System.out.println("-----After Edit-----");
        editStudent(1, "Foysal Ahmed", 15);
        showStudent();
        
        System.out.println("-----After Delete-----");
        deleteStudent(1);
        showStudent();
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
            System.out.println("New student added successfully.");
        } catch (SQLException ex) {
            System.out.println("Unable to add new student.");
            Logger.getLogger(CURDClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showStudent() {
        sql = "select * from studentdetails";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                int classIn = rs.getInt("classIn");
                System.out.println("Roll: " + roll + ", Name: " + name + ", Class In: " + classIn);
            }

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
            System.out.println("Student deleted successfully.");
        } catch (SQLException ex) {
            System.out.println("Unable to delete student.");
            Logger.getLogger(CURDClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void editStudent(int roll, String name, int classIn){
        sql = "update studentdetails set name=?, classIn=? where roll = ?";
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

}
