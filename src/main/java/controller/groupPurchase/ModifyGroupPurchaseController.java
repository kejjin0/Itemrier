package controller.groupPurchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import domain.groupPurchase.GroupPurchase;
import service.groupPurchase.GroupPurchaseService;

@Controller
@RequestMapping("/groupPurchase/modify")
public class ModifyGroupPurchaseController {
    private static final String GROUPPURCHASE_MODIFICATION_FORM = "groupPurchase/modificationForm";

    @Autowired
    private GroupPurchaseService groupPurchase;
    
    @RequestMapping(method = RequestMethod.GET)
    public String form(@RequestParam("itemId") int itemId) {
        GroupPurchase gp = groupPurchase.getGroupPuuchaaseItemById(itemId);
        
        return GROUPPURCHASE_MODIFICATION_FORM;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String modify(@ModelAttribute("modReq") GroupPurchase gpReq, Errors errors) {
        if (errors.hasErrors()) {
            return GROUPPURCHASE_MODIFICATION_FORM;
        }
        groupPurchase.updateGroupPurchaseItem(gpReq);
        return "groupPurchase/modified";
    }
}