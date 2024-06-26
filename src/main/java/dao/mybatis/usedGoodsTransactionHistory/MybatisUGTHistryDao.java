package dao.mybatis.usedGoodsTransactionHistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.UGTHistryMapper;
import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;

@Repository
public class MybatisUGTHistryDao implements UGTHistryMapper {
	@Autowired
	private UGTHistryMapper ugtHistoryMapper;
	
	// (거래 확정) 거래 내역 생성
	public void insertUsedGoodsTransactionHistory(UsedGoodsTransactionHistory h) throws DataAccessException {
		ugtHistoryMapper.insertUsedGoodsTransactionHistory(h);
	}
	
	// (구매) 사용자의 거래 내역 가져오기
	public List<UsedGoodsTransactionHistory> getUsedGoodsBuyerHistory(int buyerId) throws DataAccessException{
		return ugtHistoryMapper.getUsedGoodsBuyerHistory(buyerId);
	}
}
