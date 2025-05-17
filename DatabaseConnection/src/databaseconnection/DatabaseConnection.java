package databaseconnection;

import databaseconnection.util.DBUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        DBUtil dc = new DBUtil();

        System.out.print("What you want to do? (Insert/ View): ");
        String userChoice = scan.nextLine();
        
        if(userChoice.equalsIgnoreCase("Insert")){
            insertData(dc);
        }
        else if(userChoice.equalsIgnoreCase("View")){
            getData(dc);
        }
        else{
            System.out.println("Wrong Choice");
        }
        

    }

    public static void insertData(DBUtil dc) {
        String sql = "INSERT INTO details (name, email, phone)VALUES(?,?,?)";

        try {

            System.out.print("Your name: ");
            String name = scan.nextLine();

            System.out.print("Your email: ");
            String email = scan.nextLine();

            System.out.print("Your phone: ");
            String phone = scan.nextLine();

            try (PreparedStatement insertData = dc.getConnection().prepareStatement(sql)) {
                insertData.setString(1, name);
                insertData.setString(2, email);
                insertData.setString(3, phone);

                insertData.executeUpdate();
            }
            dc.getConnection().close();

            System.out.println("Your data inserted successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Your data insert failed.");
        }
    }

    public static void getData(DBUtil dc) {
        System.out.print("Enter Your ID: ");
        int userID = scan.nextInt();
        String sql = "SELECT * FROM details WHERE id=?";

        try {
            PreparedStatement showtData = dc.getConnection().prepareStatement(sql);
            showtData.setInt(1, userID);
            java.sql.ResultSet result = showtData.executeQuery();
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String email = result.getString("email");
                String phone = result.getString("phone");
                System.out.println("ID: " + id
                +"\nName: " + name
                +"\nEmail: " + email
                +"\nPhone: " + phone);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
}

}
