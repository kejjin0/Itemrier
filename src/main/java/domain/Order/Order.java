package domain.Order;

import java.util.Date;

public class Order {
	private int orderId;	// 주문 아이디
	private int itemId;		// 주문한 상품 아이디
	private String itemName;	// 주문한 상품 이름
	private int sellerId;	// 판매자 아이디
	private int buyerId;	// 구매자 아이디
	private String buyerName;	// 구매자 이름
	private String phoneNum;	// 구매자 전화번호
	private int zipCode;	// 우편번호
	private String addStreet;	// 주소
	private String addDetail;	// 상세주소
	private int price;		// 주문 금액
	private int quantity;	// 주문 수량
	private String pg;	// 결제 시 pg사 코드값
	private String pay_method;	// 결제 수단
	private Date orderDate;		// 결제 시간
	private String deliveryLocation;	//배송 위치
	private String deliveryRequest;		// 배송 요청 사항
	private int invoiceNumber;	// 송장번호
	private String status;	// 결제 상태 (주문 or 취소)
	private String email;	// 구매자 email
	
	public Order() {
	}

	public Order(int orderId, int itemId, String itemName, int sellerId, int buyerId, String buyerName,
			String phoneNum, int zipCode, String addStreet, String addDetail, int totalPrice, int quantity, String pg,
			String pay_method, Date orderDate, String deliveryLocation, String deliveryRequest, int invoiceNumber,
			String orderStatus, String email) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.sellerId = sellerId;
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.phoneNum = phoneNum;
		this.zipCode = zipCode;
		this.addStreet = addStreet;
		this.addDetail = addDetail;
		this.price = totalPrice;
		this.quantity = quantity;
		this.pg = pg;
		this.pay_method = pay_method;
		this.orderDate = orderDate;
		this.deliveryLocation = deliveryLocation;
		this.deliveryRequest = deliveryRequest;
		this.invoiceNumber = invoiceNumber;
		this.status = orderStatus;
		this.email = email;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddStreet() {
		return addStreet;
	}

	public void setAddStreet(String addStreet) {
		this.addStreet = addStreet;
	}

	public String getAddDetail() {
		return addDetail;
	}

	public void setAddDetail(String addDetail) {
		this.addDetail = addDetail;
	}

	public int getTotalPrice() {
		return price;
	}

	public void setTotalPrice(int totalPrice) {
		this.price = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPg() {
		return pg;
	}

	public void setPg(String pg) {
		this.pg = pg;
	}

	public String getPay_method() {
		return pay_method;
	}

	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public String getDeliveryRequest() {
		return deliveryRequest;
	}

	public void setDeliveryRequest(String deliveryRequest) {
		this.deliveryRequest = deliveryRequest;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getOrderStatus() {
		return status;
	}

	public void setOrderStatus(String orderStatus) {
		this.status = orderStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
