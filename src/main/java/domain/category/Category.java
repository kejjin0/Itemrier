package domain.category;

public class Category {
	private int catId;
    private String catName;
    private int itemId;
    
	public Category(int catId, String catName, int itemId) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.itemId = itemId;
	}
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
    
    
}
