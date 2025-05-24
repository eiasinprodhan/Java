package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Data {

    static DBUtil du = new DBUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {
        saveStudent("Atik Guru", "atikguru@gmail.com", 50000000);
    }

    public static void saveStudent(String name, String email, float fee) {
        sql = "insert into studentDetails(name, email, fee)values(?, ?, ?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            System.out.println("Student inserted successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
