package dao.mybatis.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.GroupPurchaseOrderMapper;
import domain.groupPurchase.GroupPurchase;
import domain.groupPurchaseOrder.GroupPurchaseOrder;

@Repository
public class MybatisGroupPurchaseOrderDao implements GroupPurchaseOrderMapper{
	@Autowired
	private GroupPurchaseOrderMapper gpoMapper;
	
	// 주문 생성
	public void insertGroupPurchaseOrder(GroupPurchaseOrder order) throws DataAccessException {
		gpoMapper.insertGroupPurchaseOrder(order);
	}
	
	// (구매) 구매 내역 학인 
	public List<GroupPurchase> getBuyGroupPurchase(int buyerId) throws DataAccessException{
		return gpoMapper.getBuyGroupPurchase(buyerId);
	}
	
	// (구매자) 특정 상품 구매 내역 확인
	public GroupPurchaseOrder getGroupPurchaseOrderDetailInfo(int orderId) throws DataAccessException {
		return gpoMapper.getGroupPurchaseOrderDetailInfo(orderId);
	}
	

	// (판매자) 싱픔 구매자 정보 확인
	public List<GroupPurchaseOrder> getGroupPurchaseOrderBuyersInfo(int itemId) throws DataAccessException {
		return gpoMapper.getGroupPurchaseOrderBuyersInfo(itemId);
	}
	
	
	// 구매자, 전화번호 변경
	public void updateBuyerInfo(int orderId, String buyerName, String phoneNum) throws DataAccessException {
		gpoMapper.updateBuyerInfo(orderId,buyerName,phoneNum);
	}
	
	// 배송지 변경
	public void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail) throws DataAccessException {
		gpoMapper.updateDeliveryInfo(orderId, zipCode, addStreet, addDetail);
	}
	
	// 송장 번호 입력 및 수정
	public void updateInvoiceNumberInfo(int orderId, int invoiceNumber) throws DataAccessException {
		gpoMapper.updateInvoiceNumberInfo(orderId, invoiceNumber);
	}
	
	// 현황 변경 (주문 취소 등)
	public void updateStatus(int orderId) {
		gpoMapper.updateStatus(orderId);
	}
	
	// 공동 구매 주문 취소 내역
	public GroupPurchaseOrder getCancelInfo(int orderId) {
		return gpoMapper.getCancelInfo(orderId);
	}
	
	// 결제 확인 창
	public GroupPurchaseOrder getCompletePaymentInfo (int orderId) {
		return gpoMapper.getCompletePaymentInfo(orderId);	
	}
	
	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
	
}
