package service.groupPurchase;

import java.util.List;
import domain.groupPurchase.GroupPurchase;

public interface GroupPurchaseSearchService {
	List<GroupPurchase> searchGroupPurchases(String searchWord);
}
