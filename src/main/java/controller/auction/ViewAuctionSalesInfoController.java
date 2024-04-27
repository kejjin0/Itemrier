package controller.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.auction.Auction;
import service.auction.AuctionService;

@Controller
public class ViewAuctionSalesInfoController {
	private AuctionService auctionS;
	
	@Autowired
	public void setAuctionService(AuctionService auctionS) {
		this.auctionS = auctionS;
	}
	
	@RequestMapping("/myPage/auction/inProgress")
	public ModelAndView viewAuctionInProgress(
			@RequestParam("sellerId") int sellerId) throws Exception {
		
		List<Auction> items = this.auctionS.getAuctionInProgress(sellerId);
		ModelAndView mav = new ModelAndView("AuctionInProgress");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping("/myPage/auction/ended")
	public ModelAndView viewAucitonEnded(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<Auction> items = this.auctionS.getAuctionEnded(sellerId);
		ModelAndView mav = new ModelAndView("AuctionEnded");
		mav.addObject("items", items);
		return mav;
	}
	
}
