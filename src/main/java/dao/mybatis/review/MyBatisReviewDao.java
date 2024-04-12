package dao.mybatis.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import dao.mybatis.mapper.ReviewMapper;
import domain.Review;

@Repository
public class MyBatisReviewDao implements ReviewMapper{
	@Autowired
	private ReviewMapper reviewMapper;
	
	// 리뷰 작성
	public void insertReview(Review review) throws DataAccessException {
		reviewMapper.insertReview(review);
	}
	
	// 평균 리뷰 가져오기
	public Review getUserReview(int reviewId) throws DataAccessException {
		return reviewMapper.getUserReview(reviewId);
	}

}
