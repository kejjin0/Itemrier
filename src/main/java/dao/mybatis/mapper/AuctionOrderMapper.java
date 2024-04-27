package dao.mybatis.mapper;

import java.util.List;

import domain.Order.Order;
import domain.auction.Auction;

public interface AuctionOrderMapper {
	// 주문 생성
	void insertAuctionOrder(Order order);
	
	// (구매) 구매 내역 학인 
	List<Auction> getBuyAuction(int buyerId);
	
	// (구매자) 특정 상품 구매 내역 확인
	Order getAuctionOrderDetailInfo(int orderId);

	// (판매자) 싱픔 구매자 정보 확인
	List<Order> getAuctionOrderBuyersInfo(int itemId);
	
	// 구매자, 전화번호 변경
//	void updateBuyerInfo(int orderId, String buyerName, String phoneNum);
	void updateBuyerInfo(Order order);
	
	// 배송지 변경
//	void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail);
	void updateDeliveryInfo(Order order);
	
	// 송장 번호 입력 및 수정
	Order updateInvoiceNumberInfo(Order order);
	
	// 현황 변경 (주문 취소 등)
	void updateStatus(int orderId);
	
	// 취소 확인 정보 전달
	Order getCancelInfo(int orderId);
	
	// 결제 확인 창
	Order getCompletePaymentInfo (int orderId);
}
