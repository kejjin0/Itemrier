package dao;

import java.util.List;

import domain.UsedGoodsTransactionHistory;
import org.springframework.dao.DataAccessException;

public interface UsedGoodsTransactionHistoryDao {
	
	// (거래 확정) 거래 내역 생성
	void insertUsedGoodsTransactionHistory(UsedGoodsTransactionHistory h) throws DataAccessException;
	
	// 구매자 리뷰 여부 수정
	void updateBuyerReviewYorN(int itemId, int buyerId) throws DataAccessException;
	
	// 판매자 리뷰 여부 수정
	void updateSellerReviewYorN(int itemId, int sellerId) throws DataAccessException;
	
	// (구매) 사용자의 거래 내역 가져오기
	List<UsedGoodsTransactionHistory> getUsedGoodsBuyerHistory(int itemId, int buyerId) throws DataAccessException;
}
