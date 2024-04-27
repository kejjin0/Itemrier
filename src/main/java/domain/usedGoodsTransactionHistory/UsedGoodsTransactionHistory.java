package domain.usedGoodsTransactionHistory;

import java.util.Date;

public class UsedGoodsTransactionHistory {
	private int itemId;	// 상품 아이디
	private String itemName;	// 아이템 이름
	private String price;	// 상품 금액
	private int sellerId;	// 판매자 아이디
	private int buyerId;	// 구매자 아이디
	private Date transactionDate;	// 거래 날짜
	
	
	public UsedGoodsTransactionHistory() {
	}


	public UsedGoodsTransactionHistory(int itemId, String itemName, String price, int sellerId, int buyerId,
			Date transactionDate) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.sellerId = sellerId;
		this.buyerId = buyerId;
		this.transactionDate = transactionDate;
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


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
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

	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
}
