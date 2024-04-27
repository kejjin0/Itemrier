package dao.mybatis.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.GroupPurchaseOrderMapper;
import domain.groupPurchase.GroupPurchase;
import domain.order.Order;

@Repository
public class MybatisGroupPurchaseOrderDao implements GroupPurchaseOrderMapper{
	@Autowired
	private GroupPurchaseOrderMapper gpoMapper;
	
	// 주문 생성
	public void insertGroupPurchaseOrder(Order order) throws DataAccessException {
		gpoMapper.insertGroupPurchaseOrder(order);
	}
	
	// (구매) 구매 내역 학인 
	public List<GroupPurchase> getBuyGroupPurchase(int buyerId) throws DataAccessException{
		return gpoMapper.getBuyGroupPurchase(buyerId);
	}
	
	// (구매자) 특정 상품 구매 내역 확인
	public Order getGroupPurchaseOrderDetailInfo(int orderId) throws DataAccessException {
		return gpoMapper.getGroupPurchaseOrderDetailInfo(orderId);
	}
	

	// (판매자) 싱픔 구매자 정보 확인
	public List<Order> getGroupPurchaseOrderBuyersInfo(int itemId) throws DataAccessException {
		return gpoMapper.getGroupPurchaseOrderBuyersInfo(itemId);
	}
	
	
	// 구매자, 전화번호 변경
	public void updateBuyerInfo(Order order) throws DataAccessException {
		gpoMapper.updateBuyerInfo(order);
	}
	
	// 배송지 변경
	public void updateDeliveryInfo(Order order) throws DataAccessException {
		gpoMapper.updateDeliveryInfo(order);
	}
	
	// 송장 번호 입력 및 수정
	public void updateInvoiceNumberInfo(Order order) throws DataAccessException {
		gpoMapper.updateInvoiceNumberInfo(order);
	}
	
	// 현황 변경 (주문 취소 등)
	public void updateStatus(int orderId) {
		gpoMapper.updateStatus(orderId);
	}
	
	// 공동 구매 주문 취소 내역
	public Order getCancelInfo(int orderId) {
		return gpoMapper.getCancelInfo(orderId);
	}
	
	// 결제 확인 창
	public Order getCompletePaymentInfo (int orderId) {
		return gpoMapper.getCompletePaymentInfo(orderId);	
	}
	
}
