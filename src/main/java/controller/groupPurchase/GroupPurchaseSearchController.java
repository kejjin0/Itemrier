package controller.groupPurchase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import domain.groupPurchase.*;
import service.groupPurchase.*;

@RequestMapping("/groupPurchase/search")
public class GroupPurchaseSearchController {
    @Autowired
    private GroupPurchaseSearchService gpSearchService;

    @RequestMapping(method = RequestMethod.GET)
    public List<GroupPurchase> searchGroupPurchases(@RequestParam("searchWord") String searchWord) {
        return gpSearchService.searchGroupPurchases(searchWord);
    }
}