package learndatabaseconnection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DevUtil {
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/students";
    private final String user = "root";
    private final String password = "1234";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    public DevUtil() {
        this.connection = null;
    }
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DevUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
