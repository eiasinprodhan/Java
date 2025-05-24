package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBUtil {
    private Connection c = null;
    private final String url = "jdbc:mysql://localhost:3306/student";
    private final String user = "root";
    private final String password = "1234";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
        try {
            Class.forName(driver);
             c = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
