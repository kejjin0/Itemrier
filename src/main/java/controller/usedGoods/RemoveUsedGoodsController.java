package controller.usedGoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import service.usedGoods.UsedGoodsService;

@Controller
@RequestMapping("/usedGoods/delete")
public class RemoveUsedGoodsController {
    
    @Autowired
    private UsedGoodsService usedGoods;
    
    @RequestMapping(method = RequestMethod.POST)
    public String modify(int itemId, RedirectAttributes rttr) {
        this.usedGoods.deleteUsedGoodItem(itemId);
        return "redirect:/usedGoods/list";
    }
    
//    public void setUsedGoodsService(UsedGoodsService usedGoods) {
//        this.usedGoods = usedGoods;
//    }
}