package domain.usedGoods;

import java.util.Date;

public class UsedGoods {
	private int itemId; // 상품 고유 번호
    private String itemName; // 상품 이름
    private String desc; // 상품 정보
    private String condition; // 상품 상태
    private int price; // 가격
    private String contactType; // 연락수단
    private String status; // 거래현황
    private Date registerDate; // 등록날짜
    private int sellerId; // 글 등록자 아이디
	private int buyerId; // 구매자 아이디
    private int catId; // 카테고리 아이디
	
	public UsedGoods() {}

	public UsedGoods(int itemId, String itemName, String desc, String condition, int price, String contactType,
			String status, Date registerDate, int sellerId, int buyerId, int catId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.desc = desc;
		this.condition = condition;
		this.price = price;
		this.contactType = contactType;
		this.status = status;
		this.registerDate = registerDate;
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

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
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
