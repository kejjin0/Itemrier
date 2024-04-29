package controller.groupPurchase;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import domain.groupPurchase.GroupPurchase;
import service.groupPurchase.GroupPurchaseService;

@Controller
@RequestMapping("/groupPurchase/create")
public class AddGroupPurchaseController {
    private GroupPurchaseService groupPurchase;
    private static final String GROUPPURCHASE_REGISTRATION_FORM = "groupPurchase/createForm";

    @Autowired
    public void setGroupPurchaseService(GroupPurchaseService groupPurchase) {
        this.groupPurchase = groupPurchase;
    }
    
    @ModelAttribute("regReq")
    public GroupPurchase formBacking(HttpServletRequest request) {
        GroupPurchase gp = new GroupPurchase();
        return gp;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String form() {
        return GROUPPURCHASE_REGISTRATION_FORM;
    }
    
    @RequestMapping(method = RequestMethod.POST) 
    public String submit(@ModelAttribute("regReq") GroupPurchase gp, BindingResult result, SessionStatus status) {
        System.out.println("submit() - registerRequest 객체: " + gp);
//        new GroupPurchaseValidator().validate(gp, result); 
        if (result.hasErrors()) {
            return "groupPurchase/createForm";
        }
        this.groupPurchase.insertGroupPurchaseItem(gp);
        status.setComplete();
        return "groupPurchase/created";
        
    }
}