package controller.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.auction.Auction;
import domain.groupPurchase.GroupPurchase;
import domain.review.Review;
import domain.usedGoods.UsedGoods;
import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;
import service.review.ReviewService;
import service.usedGoodsTransactionHistory.UGTHistoryService;

@Controller
public class ReviewController {
	private ReviewService reviewS;
	private UGTHistoryService ugtHistoryS;
	
	@Autowired
	public void setReviewService(ReviewService reviewS) {
		this.reviewS = reviewS;
	}
	
	@Autowired
	public void setUGTHistoryService(UGTHistoryService ugtHistoryS) {
		this.ugtHistoryS = ugtHistoryS;
	}
	
	@RequestMapping("usedGoods/seller/reviewForm")
	public String UsedGoodsSellerReview(
			@ModelAttribute("userId") int userId,
			@ModelAttribute("item") UsedGoods items,
			Model model) throws Exception{
			
		Review review = new Review();
		review.setItemType("usedGoods");
		review.setReviewerId(userId);
		review.setItemId(items.getItemId());
		review.setUserId(items.getBuyerId());
		model.addAttribute("review", review);
		return "reviewForm";
	}
	
	
	@RequestMapping("usedGoods/buyer/reviewForm")
	public String UsedGoodsBuyerReview(
			@ModelAttribute("userId") int userId,
			@ModelAttribute("item") UsedGoods items,
			Model model) throws Exception{
			
		Review review = new Review();
		review.setItemType("usedGoods");
		review.setReviewerId(userId);
		review.setItemId(items.getItemId());
		review.setUserId(items.getSellerId());
		model.addAttribute("review", review);
		return "reviewForm";
	}
	
	@RequestMapping("groupPurchase/buyer/reviewForm")
	public String GroupPurchaseReview(
			@ModelAttribute("userId") int userId,
			@ModelAttribute("item") GroupPurchase item,
			Model model) throws Exception{
			
		Review review = new Review();
		review.setItemType("groupPurchase");
		review.setReviewerId(userId);
		review.setItemId(item.getItemId());
		review.setUserId(item.getSellerId());
		model.addAttribute("review", review);
		return "reviewForm";
	}
	
	@RequestMapping("auction/buyer/reviewForm")
	public String GroupPurchaseReview(
			@ModelAttribute("userId") int userId,
			@ModelAttribute("item") Auction item,
			Model model) throws Exception{
			
		Review review = new Review();
		review.setItemType("auction");
		review.setReviewerId(userId);
		review.setItemId(item.getItemId());
		review.setUserId(item.getSellerId());
		model.addAttribute("review", review);
		return "reviewForm";
	}
	
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
