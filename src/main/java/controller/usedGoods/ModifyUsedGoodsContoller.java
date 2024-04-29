package controller.usedGoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import domain.usedGoods.UsedGoods;
import service.usedGoods.UsedGoodsService;

@Controller
@RequestMapping("/usedGoods/modify")
public class ModifyUsedGoodsContoller {
    
    private static final String USEDGOODS_MODIFICATION_FORM = "usedGoods/modificationForm";
    
    @Autowired
    private UsedGoodsService usedGoods;
    
    @RequestMapping(method = RequestMethod.GET)
    public String form(@RequestParam("itemId") int itemId) {
        UsedGoods ug = usedGoods.getUsedGoodById(itemId);
        
        return USEDGOODS_MODIFICATION_FORM;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String modify(@ModelAttribute("modReq") UsedGoods ugReq, Errors errors) {
        if (errors.hasErrors()) {
            return USEDGOODS_MODIFICATION_FORM;
        }
        usedGoods.updateUsedGoodItem(ugReq);
        return "usedGoods/modified";
    }
    
//    public void setUsedGoodsService(UsedGoodsService usedGoods) {
//        this.usedGoods = usedGoods;
//    }
}