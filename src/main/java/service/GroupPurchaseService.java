package service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import domain.GroupPurchase;

public interface GroupPurchaseService {
	 //마이페이지 위함
		// (판매) 판매 중인 내역 확인
		List<GroupPurchase> getGroupPurchaseInProgress(int sellerId) throws DataAccessException;
		
		// (판매) 판매 완료인 내역 확인
		List<GroupPurchase> getGroupPurchaseEnded(int sellerId) throws DataAccessException;
	    
}
