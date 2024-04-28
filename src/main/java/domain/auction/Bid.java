package domain.auction;
import java.sql.Timestamp;

public class Bid {
    private int bidId; // 입찰 아이디
    private int amount; // 입찰 금액
    private Timestamp bidTime; // 입찰 시간
    private int itemId; // 입찰 상품
    private int userId; // 입찰한 유저 아이디
    
    public Bid() {}
    
    public Bid(int bidId, int amount, Timestamp bidTime, int itemId, int userId) {
        super();
        this.bidId = bidId;
        this.amount = amount;
        this.bidTime = bidTime;
        this.itemId = itemId;
        this.userId = userId;
    }

    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getBidTime() {
        return bidTime;
    }

    public void setBidTime(Timestamp bidTime) {
        this.bidTime = bidTime;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
