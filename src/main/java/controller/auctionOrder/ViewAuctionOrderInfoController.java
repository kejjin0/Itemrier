package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.auction.Auction;
import domain.order.Order;
import service.auctionOrder.AuctionOrderService;

@Controller
public class ViewAuctionOrderInfoController {
private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("/myPage/auction/orders")
	public String viewAuctionOrders(
			@RequestParam("buyerId") int buyerId,
			ModelMap model) throws Exception {
		PagedListHolder<Auction> items = new PagedListHolder<Auction>(this.auctionOrderS.getBuyAuction(buyerId));
		items.setPageSize(15);
		model.put("items", items);
		return "auctionOrders";
	}
	
	@RequestMapping("/myPage/auction/orders2")
	public String viewAuctionOrders2(
			@RequestParam("page") String page,
			@ModelAttribute("items") PagedListHolder<Auction> items,
			BindingResult reulst) throws Exception{
		if (items == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { items.nextPage(); }
		else if ("previous".equals(page)) { items.previousPage(); }
		return "auctionOrders";
	}
	
	@RequestMapping("/myPage/auction/detailOrderInfo")
	public ModelAndView viewAuctionOrderDetail(
			@RequestParam("orderId") int orderId) throws Exception{
		
		Order order = this.auctionOrderS.getAuctionOrderDetailInfo(orderId);
		ModelAndView mav = new ModelAndView("auctionOrderDetail");
		mav.addObject("order", order);
		return mav;
	}
}
