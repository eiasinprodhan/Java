package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {
    private Connection connection = null;
    private final String url = "jdbc:mysql://localhost:3307/pos";
    private final String user = "root";
    private final String password = "12345";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
