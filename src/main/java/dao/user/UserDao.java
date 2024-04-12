package dao.user;


import org.springframework.dao.DataAccessException;

import domain.user.User;

public interface UserDao {

    User getProfile(String email, String password) throws DataAccessException;

    void insertUser(User user) throws DataAccessException;

    void updateUser(Long userId, User user) throws DataAccessException;
    
    void deleteUser(Long userId) throws DataAccessException;
}
