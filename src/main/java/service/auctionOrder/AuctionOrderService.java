package service.auctionOrder;

import java.util.List;

import domain.Auction;
import domain.AuctionOrder;

public interface AuctionOrderService {
	// 주문 생성
	void insertAuctionOrder(AuctionOrder order);
	
	// (구매) 구매 내역 학인 
	List<Auction> getBuyAuction(int buyerId);
	
	// (구매자) 특정 상품 구매 내역 확인
	AuctionOrder getAuctionOrderDetailInfo(int orderId);

	// (판매자) 싱픔 구매자 정보 확인
	List<AuctionOrder> getAuctionOrderBuyersInfo(int itemId);
	
	// 구매자, 전화번호 변경
	void updateBuyerInfo(int orderId, String buyerName, String phoneNum );
//	void updateBuyerInfo( AuctionOrder order);
	
	// 배송지 변경
	void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail);
//	void updateDeliveryInfo( AuctionOrder order);

	// 송장 번호 입력 및 수정
	void updateInvoiceNumberInfo(int orderId, int invoiceNumber);
//	void updateInvoiceNumberInfo( AuctionOrder order);
	
	// 현황 변경 (주문 취소 등)
	void updateStatus(int orderId);
	
	// 취소 확인 정보 전달
	AuctionOrder getCancelInfo(int orderId);
	
	// 결제 확인 창
	AuctionOrder getCompletePaymentInfo (int orderId);
	
	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
}
