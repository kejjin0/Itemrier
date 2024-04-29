package domain.auction;
import java.util.Date;

public class Auction {
    private int itemId; // 상품 고유 번호
    private String itemName; // 상품이름(제목)
    private String desc; // 상품설명
    private String condition; // 연락수단
    private int startPrice; // 시작가
    private int currentBid; // 현재 최고가
    private Date startTime; // 시작시간
    private Date endTime; // 종료시간
    private int winner; // 낙찰자 유저 아이디
    private String status; // 현황
    private int price; // 가격
    private int sellerId; // 글 등록자 아이디
    private int buyerId; // 구매자 아이디
    private int catId; // 카테고리 아이디
    
    public Auction() {}

    public Auction(int itemId, String itemName, String desc, String condition, int startPrice, int currentBid,
            Date startTime, Date endTime, int winner, String status, int price, int sellerId, int buyerId, int catId) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.desc = desc;
        this.condition = condition;
        this.startPrice = startPrice;
        this.currentBid = currentBid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.winner = winner;
        this.status = status;
        this.price = price;
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

    public int getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(int startPrice) {
        this.startPrice = startPrice;
    }

    public int getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
}
