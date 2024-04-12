package dao.mybatis.mapper;

import domain.Review;

public interface ReviewMapper {
	// ¸®ºä ÀÛ¼º
	void insertReview(Review review);
	
	// Æò±Õ ¸®ºä °¡Á®¿À±â
	Review getUserReview(int reviewId);
}
