package controller.groupPurchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.groupPurchase.GroupPurchase;
import service.groupPurchase.GroupPurchaseService;

@Controller
public class ViewGroupPurchaseController {
    @Autowired
    private GroupPurchaseService groupPurchase;
    
    @RequestMapping("/groupPurchase/view")
    public ModelAndView viewGroupPurchase(@RequestParam("itemId") int itemId) {
        GroupPurchase groupPurchase = this.groupPurchase.getGroupPuuchaaseItemById(itemId);
        ModelAndView mav = new ModelAndView("GroupPurchseItem");
        mav.addObject("groupPurchase", groupPurchase);
        return mav;
    }
}