package controller.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String viewAuctionInProgress(
			@RequestParam("sellerId") int sellerId,
			ModelMap model) throws Exception {
		
		List<Auction> items = this.auctionS.getAuctionInProgress(sellerId);
		model.put("items", items);
		return "auctionInProgress";
	}
	
	@RequestMapping("/myPage/auction/ended")
	public String viewAucitonEnded(
			@RequestParam("sellerId") int sellerId,
			ModelMap model) throws Exception{
		PagedListHolder<Auction> items = new PagedListHolder<Auction>(this.auctionS.getAuctionEnded(sellerId));
		items.setPageSize(15);
		model.put("items", items);
		return "auctionEnded";
	}
	
	@RequestMapping("/myPage/auction/ended2")
	public String viewAucitonEnded2(
			@RequestParam("page") String page,
			@ModelAttribute("items") PagedListHolder<Auction> items,
			BindingResult reulst) throws Exception{
		if (items == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { items.nextPage(); }
		else if ("previous".equals(page)) { items.previousPage(); }
		return "auctionEnded";
	}
	
}
