package dao.review;

import domain.Review;
import org.springframework.dao.DataAccessException;

public interface ReviewDao {
	// 리뷰 작성
	void insertReview(Review review) throws DataAccessException;
	
	// 평균 리뷰 가져오기
	Review getUserReview(int reviewId) throws DataAccessException;
}
