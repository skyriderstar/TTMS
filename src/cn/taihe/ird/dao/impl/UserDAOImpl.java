package cn.taihe.ird.dao.impl;

import cn.taihe.ird.dao.IUserDAO;
import cn.taihe.ird.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements IUserDAO {

    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<User> findAll(String keyword) throws Exception {
        List<User> all = new ArrayList<User>();
        ResultSet rs = null;
        String sql = "select * from user where Username like ?";
        this.pstmt = conn.prepareStatement(sql);
        this.pstmt.setString(1, "%" + keyword + "%");
        rs = pstmt.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setQuestion(rs.getString("Question"));
            user.setResult(rs.getString("Result"));
            user.setUseraddress(rs.getString("Useraddress"));
            user.setUseremail(rs.getString("Useremail"));
            user.setUsername(rs.getString("Username"));
            user.setUserpass(rs.getString("Userpass"));
            user.setUserphone(rs.getString("Userphone"));
            user.setUserRname(rs.getString("UserRname"));

            all.add(user);
        }
        rs.close();
        this.pstmt.close();
        return all;
    }
    
    @Override
    public User findById(String userid) throws Exception {
        User user = null;
        String sql = "select Username,UserRname,Userpass,Useremail,Useraddress,Userphone,Question,Result from user where Username = ?";
        pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, userid);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            user = new User();
            user.setUsername(rs.getString(1));
            user.setUserRname(rs.getString(2));
            user.setUserpass(rs.getString(3));
            user.setUseremail(rs.getString(4));
            user.setUseraddress(rs.getString(5));
            user.setUserphone(rs.getString(6));
            user.setQuestion(rs.getString(7));
            user.setResult(rs.getString(8));
        }
        this.pstmt.close();
        return user;
    }

    @Override
    public boolean delById(String userid) throws Exception {
        boolean flag = false;
        String sql = "delete from user where Username = ?";
        this.pstmt = conn.prepareStatement(sql);
        this.pstmt.setString(1, userid);
        if (this.pstmt.executeUpdate() > 0) {
            flag = true;
        }
        return flag;
    }
}
