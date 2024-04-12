package controller.auctionOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.Auction;
import domain.AuctionOrder;
import service.auctionOrder.AuctionOrderService;

@Controller
public class ViewAuctionOrderInfo {
private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("/myPage/auction/orders")
	public ModelAndView viewAuctionOrders(
			@RequestParam("buyerId") int buyerId) throws Exception {
	
		List<Auction> items = this.auctionOrderS.getBuyAuction(buyerId);
		ModelAndView mav = new ModelAndView("AuctionOrders");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping("/myPage/auction/detailOrderInfo")
	public ModelAndView viewAuctionOrderDetail(
			@RequestParam("orderId") int orderId) throws Exception{
		
		AuctionOrder order = this.auctionOrderS.getAuctionOrderDetailInfo(orderId);
		ModelAndView mav = new ModelAndView("auctionOrderDetail");
		mav.addObject("order", order);
		return mav;
	}
}
