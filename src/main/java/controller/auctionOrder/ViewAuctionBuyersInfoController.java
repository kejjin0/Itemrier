package controller.auctionOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import domain.Order.Order;
=======
import domain.order.Order;
>>>>>>> modify1
import service.auctionOrder.AuctionOrderService;

@Controller
public class ViewAuctionBuyersInfoController {
private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("myPage/auction/buyerInfo")
	public ModelAndView viewAuctionBuyersInfo(
			@RequestParam("itemId") int itemId) throws Exception{
		
		List<Order> buyers = this.auctionOrderS.getAuctionOrderBuyersInfo(itemId);
		ModelAndView mav = new ModelAndView("auctionBuyersInfo");
		mav.addObject("buyers", buyers);
		return mav;
	}
	
	@RequestMapping("myPage/auction/updateInvoiceNumber")
	public String udpateAuctionInvoiceNumber(
<<<<<<< HEAD
			@RequestParam("order") Order order) throws Exception{
=======
			@RequestParam("order")Order order) throws Exception{
>>>>>>> modify1
		
		this.auctionOrderS.updateInvoiceNumberInfo(order);
		return "myPage/auction/buyersInfo";
	}
	
}
