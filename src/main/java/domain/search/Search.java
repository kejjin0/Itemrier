package domain.search;

public class Search {
	private int userId;
	private String searchWord;
	
	public Search(int userId, String searchWord) {
		super();
		this.userId = userId;
		this.searchWord = searchWord;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	
}
