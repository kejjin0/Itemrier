package domain.groupPurchase;

public class GroupPurchase {
	private int itemId;
	private String itemName;
	private int price;
	private String status;
	private int sellerId;
	private int buyerId;
	
	public GroupPurchase(int itemId, String itemName, int price, String status, int sellerId, int buyerId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.status = status;
		this.sellerId = sellerId;
		this.buyerId = buyerId;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	
}
