package service.usedGoodsTransactionHistory;

import java.util.List;

import domain.UsedGoodsTransactionHistory;

public interface UGTHistoryService {
	// (거래 확정) 거래 내역 생성
	void insertUsedGoodsTransactionHistory(UsedGoodsTransactionHistory h);
	
	// 구매자 리뷰 여부 수정
	void updateBuyerReviewYorN(int itemId, int buyerId);
	
	// 판매자 리뷰 여부 수정
	void updateSellerReviewYorN(int itemId, int sellerId);
	
	// (구매) 사용자의 거래 내역 가져오기
	List<UsedGoodsTransactionHistory> getUsedGoodsBuyerHistory(int buyerId);
}
