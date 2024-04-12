package service.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.groupPurchaseOrder.GroupPurchaseOrderDao;
import domain.GroupPurchaseOrder;

@Service("GroupPurchaseOrderServiceImpl")
public class GroupPurchaseOrderServiceImpl implements GroupPurchaseOrderService{
	@Autowired
	private GroupPurchaseOrderDao gpoDao;
	
	// 주문 생성
	public void insertGroupPurchaseOrder(GroupPurchaseOrder order) {
		gpoDao.insertGroupPurchaseOrder(order);
	}

	// (구매) 구매 내역 학인
	public List<GroupPurchaseOrder> getBuyGroupPurchase(int buyerId){
		return gpoDao.getBuyGroupPurchase(buyerId);
	}
	// (구매자) 특정 상품 구매 내역 확인
	public GroupPurchaseOrder getGroupPurchaseOrderDetailInfo(int orderId) {
		return gpoDao.getGroupPurchaseOrderDetailInfo(orderId);
	}

	// (판매자) 싱픔 구매자 정보 확인
	public List<GroupPurchaseOrder> getGroupPurchaseOrderBuyersInfo(int itemId) {
		return gpoDao.getGroupPurchaseOrderBuyersInfo(itemId);
	}

	// 구매자, 전화번호 변경
//		void updateBuyerInfo(int orderId, String buyerName, String phoneNum );
	public void updateBuyerInfo(int orderId, String buyerName, String phoneNum) {
		gpoDao.updateBuyerInfo(orderId, buyerName, phoneNum);
	}

	// 배송지 변경
//		void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail);
	public void updateDeliveryInfo(int orderId, int zipCode, String addStreet, String addDetail) {
		gpoDao.updateDeliveryInfo(orderId, zipCode,  addStreet,addDetail);
	}

	// 송장 번호 입력 및 수정
	public void updateInvoiceNumberInfo(int orderId, int invoiceNumber) {
		gpoDao.updateInvoiceNumberInfo( orderId, invoiceNumber);
	}

	// 현황 변경 (주문 취소 등)
	public void updateStatus(int orderId) {
		gpoDao.updateStatus(orderId);
	}

	// 공동 구매 주문 취소 내역
	public GroupPurchaseOrder getCancelInfo(int orderId) {
		return gpoDao.getCancelInfo(orderId);
	}

	// 결제 확인 창
	public GroupPurchaseOrder getCompletePaymentInfo(int orderId) {
		return gpoDao.getCompletePaymentInfo(orderId);
	}
	
	// 사용자 전화번호, 주소 정보 가져오기 (user domain에)
}
