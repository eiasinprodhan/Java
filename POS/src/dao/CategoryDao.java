package dao;

import entity.Category;
import java.sql.PreparedStatement;
import util.DBUtil;

public class CategoryDao {
    DBUtil dc = new DBUtil();
    PreparedStatement ps;
    Category category = new Category();
}
