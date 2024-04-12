package dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.UGTHistryMapper;
import domain.UsedGoodsTransactionHistory;

@Repository
public class MybatisUGTHistryDao implements UGTHistryMapper {
	@Autowired
	private UGTHistryMapper ugtHistoryMapper;
	
	// (거래 확정) 거래 내역 생성
	public void insertUsedGoodsTransactionHistory(UsedGoodsTransactionHistory h) throws DataAccessException {
		ugtHistoryMapper.insertUsedGoodsTransactionHistory(h);
	}
	
	// 구매자 리뷰 여부 수정
	public void updateBuyerReviewYorN(int itemId, int buyerId) throws DataAccessException {
		ugtHistoryMapper.updateBuyerReviewYorN(itemId, buyerId);
	}
	
	// 판매자 리뷰 여부 수정
	public void updateSellerReviewYorN(int itemId, int sellerId) throws DataAccessException {
		ugtHistoryMapper.updateSellerReviewYorN(itemId, sellerId);
	}
	
	// (구매) 사용자의 거래 내역 가져오기
	public List<UsedGoodsTransactionHistory> getUsedGoodsBuyerHistory(int buyerId) throws DataAccessException{
		return ugtHistoryMapper.getUsedGoodsBuyerHistory(buyerId);
	}
}
