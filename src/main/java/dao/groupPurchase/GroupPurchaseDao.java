package dao.groupPurchase;

import java.util.List;

import org.springframework.dao.DataAccessException;

import domain.GroupPurchase;

public interface GroupPurchaseDao {
    // 공동구매 상품 등록
    void insertGroupPurchaseItem(GroupPurchase groupPurchase) throws DataAccessException;
    
    // 공동구매 상품 수정
    int updateGroupPurchaseItem(GroupPurchase groupPurchase) throws DataAccessException;
    
    // 공동구매 상품 삭제
    int deleteGroupPurchaseItem(int itemId) throws DataAccessException;
    
    // 공동구매 상품 조회
    GroupPurchase getGroupPuuchaaseItemById(int itemId) throws DataAccessException;
    
    // 할인율 및 가격 수정
    int updateDiscountAndPrice(int itemId, double newDiscRate, int newPrice) throws DataAccessException;
    
    // 현황 변경
    int updateStatus(int itemId, String status) throws DataAccessException;
    
    
    //마이페이지 위함
	// (판매) 판매 중인 내역 확인
	List<GroupPurchase> getGroupPurchaseInProgress(int sellerId) throws DataAccessException;
	
	// (판매) 판매 완료인 내역 확인
	List<GroupPurchase> getGroupPurchaseEnded(int sellerId) throws DataAccessException;
    
}