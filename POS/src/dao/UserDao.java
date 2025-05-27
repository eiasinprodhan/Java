package dao;

import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DBUtil;

public class UserDao {

    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    String sql;

    public String checkUser(String user, String pass) {
        List<User> userList = new ArrayList<>();
        String userRole = null;
        sql = "select * from user";
        try {
            ps = dc.getConnection().prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userName = rs.getString("userName");
                    String password = rs.getString("password");
                    String role = rs.getString("role");
                    userList.add(new User(id, userName, password, role));
                }

                rs.close();
                ps.close();
                dc.getConnection().close();

                for (User users : userList) {
                    

                    if (user.equals(users.getName()) && pass.equals(users.getPassword())) {
                        userRole = users.getRole();
                        break;
                    }
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Wrong username or password.");
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRole;
    }
}
