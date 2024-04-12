package domain;

public class User {
	private int userId;
	private String nickName;
	private String phoneNum;
	private String zipCode;
	private String addStreet;
	private String addDetail;
	
	public User(int userId, String nickName, String phoneNum, String zipCode, String addStreet, String addDetail) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.phoneNum = phoneNum;
		this.zipCode = zipCode;
		this.addStreet = addStreet;
		this.addDetail = addDetail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddStreet() {
		return addStreet;
	}

	public void setAddStreet(String addStreet) {
		this.addStreet = addStreet;
	}

	public String getAddDetail() {
		return addDetail;
	}

	public void setAddDetail(String addDetail) {
		this.addDetail = addDetail;
	}
	

}
