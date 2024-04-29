package controller.usedGoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.usedGoods.UsedGoods;
import service.usedGoods.UsedGoodsService;

@Controller
public class ViewUsedGoodsController {
    @Autowired
    private UsedGoodsService usedGoods;
    
    @RequestMapping("/usedGoods/view")
    public ModelAndView viewUsedGoods(@RequestParam("itemId") int itemId) {
        UsedGoods usedGood = this.usedGoods.getUsedGoodById(itemId);
        ModelAndView mav = new ModelAndView("UsedGoodItem");
        mav.addObject("usedGood", usedGood);
        return mav;
    }
}