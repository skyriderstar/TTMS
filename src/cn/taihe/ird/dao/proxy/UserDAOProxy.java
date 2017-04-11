package cn.taihe.ird.dao.proxy;

import cn.taihe.ird.dao.IUserDAO;
import cn.taihe.ird.dao.impl.UserDAOImpl;
import cn.taihe.ird.dbc.DatabaseConnection;
import cn.taihe.ird.vo.User;
import java.util.List;

public class UserDAOProxy implements IUserDAO {

    private DatabaseConnection dbc = null;
    private IUserDAO dao = null;

    public UserDAOProxy() {
        try {
            this.dbc = new DatabaseConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dao = new UserDAOImpl(dbc.getConn());
    }

    @Override
    public List<User> findAll(String keyword) throws Exception {
        List<User> all = null;
        try {
            all = this.dao.findAll(keyword);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbc.close();
        }
        return all;
    }

    @Override
    public boolean delById(String userid) throws Exception {
        boolean flag = false;
        User user = null;
        try {
            user = this.dao.findById(userid);
            if (user != null) {
                flag = this.dao.delById(userid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbc.close();
        }
        return flag;
    }

    @Override
    public User findById(String userid) throws Exception {
        User user = null;
        try {
            user = this.dao.findById(userid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.dbc.close();
        }
        return user;
    }
}
