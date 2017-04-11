package ttms;

import cn.taihe.ird.dbc.DatabaseConnection;
import cn.taihe.ird.factory.DAOUserFactory;
import cn.taihe.ird.vo.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

public class TTMS {

    public static void main(String args[]) throws Exception {

        // =====================通过ID删除====================================
//        String userid = "2";
//        User user1 = DAOUserFactory.getIUserDAOInstance().findById("2");
//        if (user1 == null) {
//            System.out.println("该用户不存在");
//        } else {
//            boolean a = DAOUserFactory.getIUserDAOInstance().delById(userid);
//            if (a) {
//                System.out.println("删除成功");
//            } else {
//                System.out.println("删除失败");
//            }
//        }
        // ====================添加用户=========================================
//        DatabaseConnection dc = new DatabaseConnection();
//        Connection conn = dc.getConn();
//        Statement stmt = conn.createStatement();
//        
//        for (int i = 0; i <= 10000; i++) {
//           String s = "user" + String.valueOf(i);
//           String sql = "insert into user values ('"+s+"','"+s+"','"+s+"','"+s+"','"+s+"','"+s+"','"+s+"','"+s+"')";
//            stmt.executeUpdate(sql);
//        }
//       // =====================查找所有的用户===================================
//        List< User> am = DAOUserFactory.getIUserDAOInstance().findAll("");
//        if (am == null) {
//            System.out.println("没有数据返回");
//        } else {
//            Iterator<User> iter = am.iterator();
//            while (iter.hasNext()) {
//                User user = iter.next();
//                System.out.println("姓名" + user.getUsername() + "\t" + "密码" + user.getUserpass());
//            }
//        }
        // =====================查找某一ID的用户=================================
        User user1 = null;
        user1 = DAOUserFactory.getIUserDAOInstance().findById("2222");
        if (null == user1) {
            System.out.println("查无此人");
        } else {
            System.out.println("姓名" + user1.getUsername() + "\t" + "密码" + user1.getUserpass());
        }
    }
}
