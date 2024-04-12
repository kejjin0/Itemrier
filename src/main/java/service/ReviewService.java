package service;

import domain.Review;

public interface ReviewService {
	// 리뷰 작성
	void insertReview(Review review);
	
	// 평균 리뷰 가져오기
	Review getUserReview(int userId);
}
