package domain.wishlist;

public class Wishlist {
	private int userId;
	private int itemId;
	
	public Wishlist(int userId, int itemId) {
		super();
		this.userId = userId;
		this.itemId = itemId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
}
