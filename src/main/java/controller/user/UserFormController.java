package controller.user;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import service.user.UserFormValidator;

@Controller
@RequestMapping({"/user/userForm"})
public class UserFormController { 

    @Value("EditUserForm")
    private String formViewName;
    @Value("index")
    private String successViewName;
    
    private UserForm userForm;
    
    @Autowired
    private UserFormValidator validator;
    public void setValidator(UserFormValidator validator) {
        this.validator = validator;
    }
        
    
    @RequestMapping(method = RequestMethod.GET)
    public String showForm() {
        return formViewName;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(
            HttpServletRequest request, HttpSession session,
            @ModelAttribute("userForm") UserForm userForm,
            BindingResult result) throws Exception {
;
        session.setAttribute("userSession", session);
        return successViewName;  
    }
}
