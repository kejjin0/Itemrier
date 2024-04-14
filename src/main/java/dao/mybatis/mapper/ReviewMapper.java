package dao.mybatis.mapper;

import domain.review.Review;

public interface ReviewMapper {
	// ���� �ۼ�
	void insertReview(Review review);
	
	// ��� ���� ��������
	Review getUserReview(int reviewId);
}
