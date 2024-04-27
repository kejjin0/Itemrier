package dao.auctionOrder;

import java.util.List;

import domain.Order.Order;
import domain.auction.Auction;
<<<<<<< HEAD
=======
import domain.order.Order;
>>>>>>> modify1

import org.springframework.dao.DataAccessException;

public interface AuctionOrderDao {
	// 주문 생성
	void insertAuctionOrder(Order order) throws DataAccessException;
	
	// (구매) 구매 내역 학인 
	List<Auction> getBuyAuction(int buyerId) throws DataAccessException;
	
	// (구매자) 특정 상품 구매 내역 확인
	Order getAuctionOrderDetailInfo(int orderId) throws DataAccessException;

	// (판매자) 싱픔 구매자 정보 확인
	List<Order> getAuctionOrderBuyersInfo(int itemId) throws DataAccessException;
	
	// 구매자, 전화번호 변경
<<<<<<< HEAD
//	void updateBuyerInfo(int orderId, String buyerName, String phoneNum ) throws DataAccessException;
	void updateBuyerInfo( Order order) throws DataAccessException;
	
	// 배송지 변경
//	void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail) throws DataAccessException;
	void updateDeliveryInfo( Order order) throws DataAccessException;

	// 송장 번호 입력 및 수정
//	void updateInvoiceNumberInfo(int orderId, int invoiceNumber) throws DataAccessException;
=======
	void updateBuyerInfo(Order order) throws DataAccessException;
	
	// 배송지 변경
	void updateDeliveryInfo(Order order) throws DataAccessException;

	// 송장 번호 입력 및 수정
>>>>>>> modify1
	void updateInvoiceNumberInfo( Order order) throws DataAccessException;
	
	// 현황 변경 (주문 취소)
	void updateStatus(int orderId) throws DataAccessException;
	
	// 취소 확인 정보 전달
	Order getCancelInfo(int orderId) throws DataAccessException;
	
	// 결제 확인 창
	Order getCompletePaymentInfo (int orderId) throws DataAccessException;
<<<<<<< HEAD
=======
	
	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
>>>>>>> modify1
}
