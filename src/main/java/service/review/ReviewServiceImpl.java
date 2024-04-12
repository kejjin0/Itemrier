package service.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.review.ReviewDao;
import domain.Review;

@Service("ReviewServiceImpl")
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewDao reviewDao;
	
	// 리뷰 작성
	public void insertReview(Review review) {
		reviewDao.insertReview(review);
	}
	
	// 평균 리뷰 가져오기
	public Review getUserReview(int reviewId) {
		return reviewDao.getUserReview(reviewId);
	}
}
