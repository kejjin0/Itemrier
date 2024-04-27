package dao.mybatis.mapper;

import java.util.List;

import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;

public interface UGTHistryMapper {
	// (거래 확정) 거래 내역 생성
	void insertUsedGoodsTransactionHistory(UsedGoodsTransactionHistory h);
	
	// (구매) 사용자의 거래 내역 가져오기
	List<UsedGoodsTransactionHistory> getUsedGoodsBuyerHistory(int buyerId);
}
