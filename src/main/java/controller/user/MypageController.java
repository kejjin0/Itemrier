package controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.user.User;
import service.user.UserService;

@Controller
public class MypageController {

    private UserService userService;

    // mypage내 프로필 값 가져오기
    @RequestMapping("/mypage")
    public ModelAndView getUser(
            @ModelAttribute("sessionUser") User user) 
            throws Exception {

        return new ModelAndView("mypage", "user", user);
    }
    
    // user 수정
    @RequestMapping("/myPage/changeForm")
    public String editUser(
            @RequestParam("user") User user,
            @RequestParam("userId") Long userId
        ) throws Exception {
        userService.updateUser(userId, user);
        return "/";
    }
    
    // user 삭제
    @RequestMapping("/myPage/deleteUser")
    public String deleteUSer(
            @RequestParam("userId") Long userId
        ) throws Exception {
        userService.deleteUser(userId);
        return "/";
    }
}
