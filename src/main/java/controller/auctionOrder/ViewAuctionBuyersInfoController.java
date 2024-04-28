package controller.auctionOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.order.Order;
import service.auctionOrder.AuctionOrderService;

@Controller
public class ViewAuctionBuyersInfoController {
private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("myPage/auction/buyerInfo")
	public String viewAuctionBuyersInfo(
			@RequestParam("itemId") int itemId,
			ModelMap model) throws Exception{
		List<Order> list = this.auctionOrderS.getAuctionOrderBuyersInfo(itemId);
		PagedListHolder<Order> buyers = new PagedListHolder<Order>(list);
		buyers.setPageSize(15);
		model.put("buyers", buyers);
		model.put("count", list.size());
		return "auctionBuyersInfo";
	}
	
	@RequestMapping("myPage/auction/buyerInfo2")
	public String viewAuctionBuyersInfo2(
			@RequestParam("page") String page,
			@ModelAttribute("buyers") PagedListHolder<Order> buyers,
			BindingResult result) throws Exception{
		if (buyers == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { buyers.nextPage(); }
		else if ("previous".equals(page)) { buyers.previousPage(); }
		return "auctionBuyersInfo";
	}
	
	
	@RequestMapping("myPage/auction/updateInvoiceNumber")
	public String udpateAuctionInvoiceNumber(
			@RequestParam("order") Order order,
			Model model) throws Exception{
		
		this.auctionOrderS.updateInvoiceNumberInfo(order);
		model.addAttribute("itemId", order.getOrderId());
		return "redirct:/myPage/auction/buyerInfo";
	}
	
}
