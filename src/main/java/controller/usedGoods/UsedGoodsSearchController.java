package controller.usedGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import domain.usedGoods.*;
import service.usedGoods.*;

@RequestMapping("/usedGoods/search")
public class UsedGoodsSearchController {
	@Autowired
    private UsedGoodsSearchService usedGoodsSearchService;

	@RequestMapping(method = RequestMethod.GET)
    public List<UsedGoods> searchUsedGoods(@RequestParam("searchWord") String searchWord) {
        return usedGoodsSearchService.searchUsedGoods(searchWord);
    }
}
