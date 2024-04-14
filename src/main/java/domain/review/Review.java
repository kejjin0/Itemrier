package domain.review;

public class Review {
	private int reivewId;	// 리뷰 아이디
	private int userId;		// 사용자 아이디
	private int itemId;		// 구매 또는 판매한 물품 아이디
	private String itemType; 	// 중고 거래? 공구? 경매?
	private int reviewerId;		// 리뷰를 작성한 유저 아이디
	private Double satisfactionRate;	// 평균 만족도
	private Double speedOfAnswer;		// 평균 답장 속도 점수
	private Double promise;		// 평균 약속 지킴에 대한 점수
	
	public Review() {
	}

	public Review(int reivewId, int userId, int itemId, String itemType, int reviewerId, Double satisfactionRate,
			Double speedOfAnswer, Double promise) {
		super();
		this.reivewId = reivewId;
		this.userId = userId;
		this.itemId = itemId;
		this.itemType = itemType;
		this.reviewerId = reviewerId;
		this.satisfactionRate = satisfactionRate;
		this.speedOfAnswer = speedOfAnswer;
		this.promise = promise;
	}



	public int getReivewId() {
		return reivewId;
	}
	
	public void setReivewId(int reivewId) {
		this.reivewId = reivewId;
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

	public int getReviewerId() {
		return reviewerId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Double getSatisfactionRate() {
		return satisfactionRate;
	}

	public void setSatisfactionRate(Double satisfactionRate) {
		this.satisfactionRate = satisfactionRate;
	}

	public void setReviewerId(int reviewerId) {
		this.reviewerId = reviewerId;
	}

	public Double getSatistationRate() {
		return satisfactionRate;
	}
	
	public void setSatistationRate(Double satistationRate) {
		this.satisfactionRate = satistationRate;
	}
	
	public Double getSpeedOfAnswer() {
		return speedOfAnswer;
	}
	
	public void setSpeedOfAnswer(Double speedOfAnswer) {
		this.speedOfAnswer = speedOfAnswer;
	}
	
	public Double getPromise() {
		return promise;
	}
	
	public void setPromise(Double promise) {
		this.promise = promise;
	}
	
}
