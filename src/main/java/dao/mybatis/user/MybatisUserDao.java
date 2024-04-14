package dao.mybatis.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.user.UserMapper;
import dao.user.UserDao;
import domain.user.User;


@Repository
public class MybatisUserDao implements UserDao {

    @Autowired
    private UserMapper userMapper;
    
    public User getProfile(String email, String password) throws DataAccessException {
        return userMapper.getProfile(email, password);
    }

    public void insertUser(User user) throws DataAccessException {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Long userId) throws DataAccessException {
        userMapper.deleteUser(userId);
        
    }

    @Override
    public void updateUser(Long userId, User user) throws DataAccessException {
        // TODO Auto-generated method stub
        userMapper.updateUser(user);
    }
 
}
