package controller.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.Review;
import service.ReviewService;

@Controller
public class AddReviewController {
	private ReviewService reviewS;
	
	@Autowired
	public void setReviewService(ReviewService reviewS) {
		this.reviewS = reviewS;
	}
	
	
	@RequestMapping("/mypage/addReview.do")
	public String handleRequest(
			@RequestParam("review") Review review) throws Exception{
		
		this.reviewS.insertReview(review);
		return "myPage";
	}
	
}
