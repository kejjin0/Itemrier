package service.auctionOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.auctionOrder.AuctionOrderDao;
import domain.Order.Order;
import domain.auction.Auction;

@Service("AuctionOrderServiceImpl")
public class AuctionOrderServiceImpl implements AuctionOrderService{
	@Autowired
	private AuctionOrderDao auctionOrderDao;
	
	// 주문 생성
	public void insertAuctionOrder(Order order) {
		auctionOrderDao.insertAuctionOrder(order);
	}
	
	// (구매) 구매 내역 학인 
	public List<Auction> getBuyAuction(int buyerId){
		return auctionOrderDao.getBuyAuction(buyerId);
	}
	
	// (구매자) 특정 상품 구매 내역 확인
	public Order getAuctionOrderDetailInfo(int orderId) {
		return auctionOrderDao.getAuctionOrderDetailInfo(orderId);
	}

	// (판매자) 싱픔 구매자 정보 확인
	public List<Order> getAuctionOrderBuyersInfo(int itemId) {
		return auctionOrderDao.getAuctionOrderBuyersInfo(itemId);
	}
	
	// 구매자, 전화번호 변경
//	void updateBuyerInfo(int orderId, String buyerName, String phoneNum );
	public void updateBuyerInfo(Order order) {
		auctionOrderDao.updateBuyerInfo(order);
	}
	
	// 배송지 변경
//	void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail);
	public void updateDeliveryInfo(Order order) {
		auctionOrderDao.updateDeliveryInfo( order);
	}

	// 송장 번호 입력 및 수정
//	void updateInvoiceNumberInfo(int orderId, int invoiceNumber);
	public void updateInvoiceNumberInfo(Order order) {
		auctionOrderDao.updateInvoiceNumberInfo(order);
	}
	
	// 현황 변경 (주문 취소 등)
	public void updateStatus(int orderId) {
		auctionOrderDao.updateStatus(orderId);
	}
	
	// 취소 확인 정보 전달
	public Order getCancelInfo(int orderId) {
		return auctionOrderDao.getCancelInfo(orderId);
	}
	
	// 결제 확인 창
	public Order getCompletePaymentInfo (int orderId) {
		return auctionOrderDao.getCompletePaymentInfo(orderId);
	}

}
