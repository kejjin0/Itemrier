package service.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.groupPurchaseOrder.GroupPurchaseOrderDao;
import domain.groupPurchase.GroupPurchase;
import domain.order.Order;

@Service("GroupPurchaseOrderServiceImpl")
public class GroupPurchaseOrderServiceImpl implements GroupPurchaseOrderService{
	@Autowired
	private GroupPurchaseOrderDao gpoDao;
	
	// 주문 생성
	public void insertGroupPurchaseOrder(Order order) {
		gpoDao.insertGroupPurchaseOrder(order);
	}

	// (구매) 구매 내역 학인
	public List<GroupPurchase> getBuyGroupPurchase(int buyerId){
		return gpoDao.getBuyGroupPurchase(buyerId);
	}
	// (구매자) 특정 상품 구매 내역 확인
	public Order getGroupPurchaseOrderDetailInfo(int orderId) {
		return gpoDao.getGroupPurchaseOrderDetailInfo(orderId);
	}

	// (판매자) 싱픔 구매자 정보 확인
	public List<Order> getGroupPurchaseOrderBuyersInfo(int itemId) {
		return gpoDao.getGroupPurchaseOrderBuyersInfo(itemId);
	}

	// 구매자, 전화번호 변경
//		void updateBuyerInfo(int orderId, String buyerName, String phoneNum );
	public void updateBuyerInfo(Order order) {
		gpoDao.updateBuyerInfo(order);
	}

	// 배송지 변경
//		void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail);
	public void updateDeliveryInfo(Order order) {
		gpoDao.updateDeliveryInfo(order);
	}

	// 송장 번호 입력 및 수정
	public void updateInvoiceNumberInfo(Order order) {
		gpoDao.updateInvoiceNumberInfo(order);
	}

	// 현황 변경 (주문 취소 등)
	public void updateStatus(int orderId) {
		gpoDao.updateStatus(orderId);
	}

	// 공동 구매 주문 취소 내역
	public Order getCancelInfo(int orderId) {
		return gpoDao.getCancelInfo(orderId);
	}

	// 결제 확인 창
	public Order getCompletePaymentInfo(int orderId) {
		return gpoDao.getCompletePaymentInfo(orderId);
	}
}
