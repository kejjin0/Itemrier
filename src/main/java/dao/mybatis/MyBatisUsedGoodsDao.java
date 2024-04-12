package dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.UsedGoodsMapper;
import domain.UsedGoods;

@Repository
public class MyBatisUsedGoodsDao implements UsedGoodsMapper {
	@Autowired
    private UsedGoodsMapper usedGoodMapper;
    
    @Override
    public void insertUsedGoodItem(UsedGoods usedGood) throws DataAccessException {
        usedGoodMapper.insertUsedGoodItem(usedGood);
    }

    @Override
    public int updateUsedGoodItem(UsedGoods usedGood) throws DataAccessException {
        return usedGoodMapper.updateUsedGoodItem(usedGood);
    }

    @Override
    public int deleteUsedGoodItem(int itemId) throws DataAccessException {
        return usedGoodMapper.deleteUsedGoodItem(itemId);
    }

    @Override
    public UsedGoods getUsedGoodById(int itemId) throws DataAccessException {
        return usedGoodMapper.getUsedGoodById(itemId);
    }

    @Override
    public void updateUsedGoodStatus(int itemId, String status) throws DataAccessException {
        usedGoodMapper.updateUsedGoodStatus(itemId, status);
    }
    
    
    /// 마이페이지에 필요
	// (판매) 사용자의 거래 내역 가져오기
	public List<UsedGoods> getUsedGoodsInProgress(int sellerId) throws DataAccessException{
		return usedGoodMapper.getUsedGoodsInProgress(sellerId);
	}
	
	// (판매) 판매 완료된 내역 가져오기
	public List<UsedGoods> getUsedGoodsEnded(int sellerId) throws DataAccessException{
		return usedGoodMapper.getUsedGoodsEnded(sellerId);
	}

}