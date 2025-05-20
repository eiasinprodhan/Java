package curd;

import java.sql.PreparedStatement;
import util.DatabseConnection;

public class CURD {
    DatabseConnection dc = new DatabseConnection();
    PreparedStatement ps;
    String sql="";
    
    public static void main(String[] args) {
        
    }
    
    public static void saveEmployee(String name, String email, float salary){
        sql = "insert into"
    }
}
