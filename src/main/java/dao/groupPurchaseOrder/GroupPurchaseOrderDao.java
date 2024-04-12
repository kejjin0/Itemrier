package dao.groupPurchaseOrder;

import java.util.List;

import domain.GroupPurchaseOrder;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPurchaseOrderDao {
	// 주문 생성
	void insertGroupPurchaseOrder(GroupPurchaseOrder order) throws DataAccessException;
	
	// (구매) 구매 내역 학인 
	List<GroupPurchaseOrder> getBuyGroupPurchase(int buyerId) throws DataAccessException;
	
	// (구매자) 특정 상품 구매 내역 확인
	GroupPurchaseOrder getGroupPurchaseOrderDetailInfo(int orderId) throws DataAccessException;
	

	// (판매자) 싱픔 구매자 정보 확인
	List<GroupPurchaseOrder> getGroupPurchaseOrderBuyersInfo(int itemId) throws DataAccessException;
	
	
	// 구매자, 전화번호 변경
	void updateBuyerInfo(int orderId, String buyerName, String phoneNum )  throws DataAccessException;
//	void updateBuyerInfo(GroupPurchaseOrder order) throws DataAccessException;
	
	// 배송지 변경
	void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail)  throws DataAccessException;
//	void updateDeliveryInfo(GroupPurchaseOrder order) throws DataAccessException;
	
	// 송장 번호 입력 및 수정
	void updateInvoiceNumberInfo(int orderId, int invoiceNumber) throws DataAccessException;
//	void updateInvoiceNumberInfo(GroupPurchaseOrder order) throws DataAccessException;
	
	// 현황 변경 (주문 취소 등)
	void updateStatus(int orderId) throws DataAccessException;
	
	// 공동 구매 주문 취소 내역
	GroupPurchaseOrder getCancelInfo(int orderId) throws DataAccessException;
	
	// 결제 확인 창
	GroupPurchaseOrder getCompletePaymentInfo (int orderId) throws DataAccessException;
	
	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
}
