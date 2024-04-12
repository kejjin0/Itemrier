package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.GroupPurchaseDao;
import domain.GroupPurchase;

@Service("GroupPurchaseServiceImpl")
public class GroupPurchaseServiceImpl implements GroupPurchaseService{
	@Autowired
	private GroupPurchaseDao groupPurchaseDao;
	
	// 마이페이지 위함
	// (판매) 판매 중인 내역 확인
	public List<GroupPurchase> getGroupPurchaseInProgress(int sellerId){
		return groupPurchaseDao.getGroupPurchaseInProgress(sellerId);
	}

	// (판매) 판매 완료인 내역 확인
	public List<GroupPurchase> getGroupPurchaseEnded(int sellerId){
		return groupPurchaseDao.getGroupPurchaseEnded(sellerId);
	}
}
