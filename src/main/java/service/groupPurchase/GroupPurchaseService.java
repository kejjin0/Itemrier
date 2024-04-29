package service.groupPurchase;

import java.util.List;

import org.springframework.dao.DataAccessException;

import domain.groupPurchase.GroupPurchase;

public interface GroupPurchaseService {
	// 공동구매 상품 등록
	public void insertGroupPurchaseItem(GroupPurchase groupPurchase);

	// 공동구매 상품 수정
    public int updateGroupPurchaseItem(GroupPurchase groupPurchase);

    // 공동구매 상품 삭제
    public int deleteGroupPurchaseItem(int itemId);

    // 공동구매 상품 조회
    public GroupPurchase getGroupPuuchaaseItemById(int itemId);

    // 할인율 및 가격 수정
    public int updateDiscountAndPrice(int itemId, double newDiscRate, int newPrice);

    // 현황 변경
    public int updateStatus(int itemId, String status);

	//마이페이지 위함
	// (판매) 판매 중인 내역 확인
	List<GroupPurchase> getGroupPurchaseInProgress(int sellerId) throws DataAccessException;
	
	// (판매) 판매 완료인 내역 확인
	List<GroupPurchase> getGroupPurchaseEnded(int sellerId) throws DataAccessException;
	    
}
