package cn.taihe.ird.dao;

import cn.taihe.ird.vo.User;
import java.util.List;

public interface IUserDAO {
    // 查找符合要求的所有用户
    public List<User> findAll(String keyword) throws Exception;
    // 查找符合要求的单个用户
    public User findById(String userid) throws Exception;
    // 通过用户ID删除用户
    public boolean delById(String userid) throws Exception;
}
