package cn.taihe.ird.factory;

import cn.taihe.ird.dao.IUserDAO;
import cn.taihe.ird.dao.proxy.UserDAOProxy;

public class DAOUserFactory {

    public static IUserDAO getIUserDAOInstance() {
        return new UserDAOProxy();
    }
}
