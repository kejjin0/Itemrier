package service.groupPurchaseOrder;

import java.util.List;

import domain.Order.Order;

public interface GroupPurchaseOrderService {
	// 주문 생성
	void insertGroupPurchaseOrder(Order order);

	// (구매) 구매 내역 학인
	List<Order> getBuyGroupPurchase(int buyerId);

	// (구매자) 특정 상품 구매 내역 확인
	Order getGroupPurchaseOrderDetailInfo(int orderId);

	// (판매자) 싱픔 구매자 정보 확인
	List<Order> getGroupPurchaseOrderBuyersInfo(int itemId);

	// 구매자, 전화번호 변경
//		void updateBuyerInfo(int orderId, String buyerName, String phoneNum );
	void updateBuyerInfo(Order order);

	// 배송지 변경
//		void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail);
	void updateDeliveryInfo(Order order);

	// 송장 번호 입력 및 수정
//	void updateInvoiceNumberInfo(int orderId, int invoiceNumber);
	void updateInvoiceNumberInfo(Order order);


	//주문 취소
	void updateStatus(int orderId);

	// 공동 구매 주문 취소 내역
	Order getCancelInfo(int orderId);

	// 결제 확인 창
	Order getCompletePaymentInfo(int orderId);

	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
}
