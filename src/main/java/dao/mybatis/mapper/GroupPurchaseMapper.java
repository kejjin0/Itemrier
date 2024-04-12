package dao.mybatis.mapper;

import java.util.List;

import domain.GroupPurchase;

public interface GroupPurchaseMapper {
    // 공동구매 상품 등록
    void insertGroupPurchaseItem(GroupPurchase groupPurchase);
    
    // 공동구매 상품 수정
    int updateGroupPurchaseItem(GroupPurchase groupPurchase);
    
    // 공동구매 상품 삭제
    int deleteGroupPurchaseItem(int itemId);
    
    // 공동구매 상품 조회
    GroupPurchase getGroupPuuchaaseItemById(int itemId);
    
    // 할인율 및 가격 수정
    int updateDiscountAndPrice(int itemId, double newDiscRate, int newPrice);
    
    // 현황 변경
    int updateStatus(int itemId, String status);
    
    
    //마이페이지 위함
    // (판매) 판매 중인 내역 확인
 	List<GroupPurchase> getGroupPurchaseInProgress(int sellerId);
 	
	// (판매) 판매 완료인 내역 확인
	List<GroupPurchase> getGroupPurchaseEnded(int sellerId);
}
