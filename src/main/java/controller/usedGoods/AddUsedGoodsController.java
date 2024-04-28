package controller.usedGoods;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import domain.usedGoods.UsedGoods;
import service.usedGoods.UsedGoodsService;

@Controller
@RequestMapping("/usedGoods/create")
public class AddUsedGoodsController {
    
    @Autowired
    private UsedGoodsService usedGoods;
    private static final String USEDGOOD_REGISTRATION_FORM = "usedGoods/createForm";
    
    @ModelAttribute("regReq")
    public UsedGoods formBacking(HttpServletRequest request) {
        UsedGoods ug = new UsedGoods();
        return ug;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String form() {
        return USEDGOOD_REGISTRATION_FORM;
    }
    
    @RequestMapping(method = RequestMethod.POST) 
    public String submit(@ModelAttribute("regReq") UsedGoods ug, BindingResult result, SessionStatus status) {
        System.out.println("submit() - registerRequest 객체: " + ug);
//        new UsedGoodsValidator().validate(ug, result);
        if (result.hasErrors()) {
            return "usedGoods/createForm";
        }
        this.usedGoods.insertUsedGoodItem(ug);
        status.setComplete();
        return "usedGoods/created";
    }
    
//    public void setUsedGoodsService(UsedGoodsService usedGoods) {
//        this.usedGoods = usedGoods;
//    }
}
