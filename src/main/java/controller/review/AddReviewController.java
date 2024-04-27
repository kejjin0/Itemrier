package controller.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.review.Review;
import service.review.ReviewService;

@Controller
public class AddReviewController {
	private ReviewService reviewS;
	
	@Autowired
	public void setReviewService(ReviewService reviewS) {
		this.reviewS = reviewS;
	}
	
//	public readyForSubmit(
//			@RequestParam("")
	
	@RequestMapping("/mypage/addReview")
	public String submitReview(
			@RequestParam("review") Review review) throws Exception{
		
		this.reviewS.insertReview(review);
		return "myPage";
	}
	
	
	@RequestMapping("/viewReview")
	public ModelAndView viewReview(
			@RequestParam("userId") int userId) throws Exception{
		
		Review review = this.reviewS.getUserReview(userId);
		ModelAndView mav = new ModelAndView("viewReview");
		mav.addObject("review", review);
		return mav;
	}
	
}
