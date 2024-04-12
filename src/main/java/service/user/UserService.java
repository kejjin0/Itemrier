package service.user;

import dao.user.UserDao;
import domain.user.User;

public class UserService {
    public UserDao userDao;

    // user 찾기
    public User findById(Long id){
        return null;
    }
    
    // 회원가입
    public void insertUser(User user) {
        userDao.insertUser(user);
    }
    
    // user 수정
    public void updateUser(Long userId, User user) {
        userDao.updateUser(userId, user);
    }
    
    // user 삭제
    public Boolean deleteUser(Long userId) {
        userDao.deleteUser(userId);
        return true;
    }
}
