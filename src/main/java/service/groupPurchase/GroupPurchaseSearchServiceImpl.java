package service.groupPurchase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.groupPurchase.GroupPurchaseDao;
import domain.groupPurchase.GroupPurchase;

@Service
public class GroupPurchaseSearchServiceImpl {
    @Autowired
    private GroupPurchaseDao groupPurchaseDao;

    public List<GroupPurchase> searchGroupPurchases(String searchWord) {
        return groupPurchaseDao.searchGroupPurchases(searchWord);
    }
}
