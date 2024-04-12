package domain;

public class UsedGoods {
	private int itemId;
	private String itemName;
	private String status;
	private int sellerId;
	private int buyerId;
	
	public UsedGoods(int itemId, String itemName, String status, int seller, int buyer) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.status = status;
		this.sellerId = seller;
		this.buyerId = buyer;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSeller() {
		return sellerId;
	}
	public void setSeller(int seller) {
		this.sellerId = seller;
	}
	public int getBuyer() {
		return buyerId;
	}
	public void setBuyer(int buyer) {
		this.buyerId = buyer;
	}

}
