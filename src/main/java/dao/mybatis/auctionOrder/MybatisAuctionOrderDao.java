package dao.mybatis.auctionOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.AuctionOrderMapper;
import domain.Auction;
import domain.AuctionOrder;

@Repository
public class MybatisAuctionOrderDao implements AuctionOrderMapper{
	@Autowired
	private AuctionOrderMapper auctionOrderMapper;
	
	// 주문 생성
	public void insertAuctionOrder(AuctionOrder order) throws DataAccessException {
		auctionOrderMapper.insertAuctionOrder(order);
	}
	
	// (구매) 구매 내역 학인 
	public List<Auction> getBuyAuction(int buyerId) throws DataAccessException{
		return auctionOrderMapper.getBuyAuction(buyerId);
	}
	
	// (구매자) 특정 상품 구매 내역 확인
	public AuctionOrder getAuctionOrderDetailInfo(int orderId)  throws DataAccessException{
		return auctionOrderMapper.getAuctionOrderDetailInfo(orderId);
	}


	// (판매자) 싱픔 구매자 정보 확인
	public List<AuctionOrder> getAuctionOrderBuyersInfo(int itemId) throws DataAccessException {
		return auctionOrderMapper.getAuctionOrderBuyersInfo(itemId);
	}
	
	// 구매자, 전화번호 변경
	public void updateBuyerInfo(int orderId, String buyerName, String phoneNum) throws DataAccessException {
		auctionOrderMapper.updateBuyerInfo(orderId,buyerName,phoneNum);
	}
	
	// 배송지 변경
	public void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail) throws DataAccessException {
		auctionOrderMapper.updateDeliveryInfo(orderId, zipCode, addStreet, addDetail);
	}
	
	// 송장 번호 입력 및 수정
	public AuctionOrder updateInvoiceNumberInfo(int orderId, int invoiceNumber) throws DataAccessException {
		return auctionOrderMapper.updateInvoiceNumberInfo( orderId, invoiceNumber);
	}
	
	// 현황 변경 (주문 취소 등)
	public void updateStatus(int orderId) throws DataAccessException {
		auctionOrderMapper.updateStatus(orderId);
	}
	
	// 취소 확인 정보 전달
	public AuctionOrder getCancelInfo(int orderId) throws DataAccessException {
		return auctionOrderMapper.getCancelInfo(orderId);
	}
	
	// 결제 확인 창
	public 	// 결제 확인 창
	AuctionOrder getCompletePaymentInfo (int orderId) throws DataAccessException {
		return auctionOrderMapper.getCompletePaymentInfo(orderId);
	}
	
	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
}
