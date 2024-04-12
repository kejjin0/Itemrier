package dao.mybatis.groupPurchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.GroupPurchaseMapper;
import domain.GroupPurchase;

@Repository
public class MyBatisGroupPurchaseDao implements GroupPurchaseMapper {
	@Autowired
    private GroupPurchaseMapper groupPurchaseMapper;
    
    @Override
    public void insertGroupPurchaseItem(GroupPurchase groupPurchase) throws DataAccessException {
           groupPurchaseMapper.insertGroupPurchaseItem(groupPurchase);
    }

    @Override
    public int updateGroupPurchaseItem(GroupPurchase groupPurchase) throws DataAccessException {
        return groupPurchaseMapper.updateGroupPurchaseItem(groupPurchase);
    }

    @Override
    public int deleteGroupPurchaseItem(int itemId) throws DataAccessException {
        return groupPurchaseMapper.deleteGroupPurchaseItem(itemId);
    }

    @Override
    public GroupPurchase getGroupPuuchaaseItemById(int itemId) throws DataAccessException {
        return groupPurchaseMapper.getGroupPuuchaaseItemById(itemId);
    }

    @Override
    public int updateDiscountAndPrice(int itemId, double newDiscRate, int newPrice) throws DataAccessException {
        return groupPurchaseMapper.updateDiscountAndPrice(itemId, newDiscRate, newPrice);
    }

    @Override
    public int updateStatus(int itemId, String status) throws DataAccessException {
        return groupPurchaseMapper.updateStatus(itemId, status);
    }

    
    //마이페이지 위함
	// (판매) 판매 중인 내역 확인
	public List<GroupPurchase> getGroupPurchaseInProgress(int sellerId) throws DataAccessException{
		return groupPurchaseMapper.getGroupPurchaseInProgress(sellerId);
	}
	
	// (판매) 판매 완료인 내역 확인
	public List<GroupPurchase> getGroupPurchaseEnded(int orderId){
		return groupPurchaseMapper.getGroupPurchaseEnded(orderId);
	}
}
