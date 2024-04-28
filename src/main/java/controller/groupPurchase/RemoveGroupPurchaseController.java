package controller.groupPurchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import service.groupPurchase.GroupPurchaseService;

@Controller
@RequestMapping("/groupPurchase/delete")
public class RemoveGroupPurchaseController {
    @Autowired
    private GroupPurchaseService groupPurchase;
    
    @RequestMapping(method = RequestMethod.POST)
    public String modify(int itemId, RedirectAttributes rttr) {
        this.groupPurchase.deleteGroupPurchaseItem(itemId);
        return "redirect:/usedGoods/list";
    }
}