package service.usedGoodsTransactionHistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.usedGoodsTransactionHistory.UsedGoodsTransactionHistoryDao;
import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;

@Service("UGTHistoryServiceImp")
public class UGTHistoryServiceImpl implements UGTHistoryService{
	@Autowired
	private UsedGoodsTransactionHistoryDao historyDao;
	
	// (거래 확정) 거래 내역 생성
	public void insertUsedGoodsTransactionHistory(UsedGoodsTransactionHistory h) {
		historyDao.insertUsedGoodsTransactionHistory(h);
	}
	
	// 구매자 리뷰 여부 수정
	public void updateBuyerReviewYorN(int itemId, int buyerId) {
		historyDao.updateBuyerReviewYorN(itemId, buyerId);
	}
	
	// 판매자 리뷰 여부 수정
	public void updateSellerReviewYorN(int itemId, int sellerId) {
		historyDao.updateSellerReviewYorN(itemId, sellerId);
	}
	
	// (구매) 사용자의 거래 내역 가져오기
	public List<UsedGoodsTransactionHistory> getUsedGoodsBuyerHistory(int buyerId){
		return historyDao.getUsedGoodsBuyerHistory(buyerId);
	}
}
