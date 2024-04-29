package domain.groupPurchase;

import java.util.Date;

public class GroupPurchase {
	private int itemId; // 상품 고유 번호
	private String itemName; // 상품 이름(제목)
	private String desc; // 상품 설명
//	private int quantity; // 상품 수량
	private int minQuantity; // 최소수량
	private int totalQuantity; // 최대수량
	private int price; // 가격
//	private Date startTime; // 시작시간
    private Date endTime; // 종료시간
    private double discRate; // 할인율
	private String status;
	private int sellerId; // 글 등록자 아이디
	private int buyerId; // 구매자 아이디
	private int catId; // 카테고리 아이디
	
	
	public GroupPurchase() {}

	public GroupPurchase(int itemId, String itemName, String desc, int minQuantity, int totalQuantity, int price,
			Date endTime, double discRate, String status, int sellerId, int buyerId, int catId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.desc = desc;
		this.minQuantity = minQuantity;
		this.totalQuantity = totalQuantity;
		this.price = price;
		this.endTime = endTime;
		this.discRate = discRate;
		this.status = status;
		this.sellerId = sellerId;
		this.buyerId = buyerId;
		this.catId = catId;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(int minQuantity) {
		this.minQuantity = minQuantity;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public double getDiscRate() {
		return discRate;
	}

	public void setDiscRate(double discRate) {
		this.discRate = discRate;
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

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}
}
