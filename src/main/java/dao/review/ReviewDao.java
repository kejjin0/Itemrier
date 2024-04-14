package dao.review;

import org.springframework.dao.DataAccessException;

import domain.review.Review;

public interface ReviewDao {
	// 리뷰 작성
	void insertReview(Review review) throws DataAccessException;
	
	// 평균 리뷰 가져오기
	Review getUserReview(int reviewId) throws DataAccessException;
}
