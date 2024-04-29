package service.groupPurchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.groupPurchase.GroupPurchaseDao;
import domain.groupPurchase.GroupPurchase;

@Service("GroupPurchaseServiceImpl")
public class GroupPurchaseServiceImpl implements GroupPurchaseService{
	@Autowired
	private GroupPurchaseDao groupPurchaseDao;
	
    // 공동구매 상품 등록
	public void insertGroupPurchaseItem(GroupPurchase groupPurchase) {
        groupPurchaseDao.insertGroupPurchaseItem(groupPurchase);
    }

    // 공동구매 상품 수정
    public int updateGroupPurchaseItem(GroupPurchase groupPurchase) {
        return groupPurchaseDao.updateGroupPurchaseItem(groupPurchase);
    }

    // 공동구매 상품 삭제
    public int deleteGroupPurchaseItem(int itemId) {
        return groupPurchaseDao.deleteGroupPurchaseItem(itemId);
    }

    // 공동구매 상품 조회
    public GroupPurchase getGroupPuuchaaseItemById(int itemId) {
        return groupPurchaseDao.getGroupPuuchaaseItemById(itemId);
    }

    // 할인율 및 가격 수정
    public int updateDiscountAndPrice(int itemId, double newDiscRate, int newPrice) {
        return groupPurchaseDao.updateDiscountAndPrice(itemId, newDiscRate, newPrice);
    }

    // 현황 변경
    public int updateStatus(int itemId, String status) {
        return groupPurchaseDao.updateStatus(itemId, status);
    }
	
	// 마이페이지 위함
	// (판매) 판매 중인 내역 확인
	public List<GroupPurchase> getGroupPurchaseInProgress(int sellerId){
		return groupPurchaseDao.getGroupPurchaseInProgress(sellerId);
	}

	// (판매) 판매 완료인 내역 확인
	public List<GroupPurchase> getGroupPurchaseEnded(int sellerId){
		return groupPurchaseDao.getGroupPurchaseEnded(sellerId);
	}
}
