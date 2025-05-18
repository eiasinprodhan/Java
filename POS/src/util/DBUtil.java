package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {
    private Connection connection = null;
    private final String url = "jdbc:mysql://sql200.ezyro.com:3306/ezyro_39014709_swing";
    private final String user = "ezyro_39014709";
    private final String password = "fa1d9dd23a0183";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
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
