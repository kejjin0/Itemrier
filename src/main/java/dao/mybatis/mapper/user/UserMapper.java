package dao.mybatis.mapper.user;

import domain.user.User;

public interface UserMapper {

    User getProfile(String email, String password);

    void insertUser(User user);
    
    void updateUser(User user);

    void deleteUser(Long userId);

}
