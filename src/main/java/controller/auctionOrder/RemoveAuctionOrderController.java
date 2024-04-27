package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.order.Order;
import service.auctionOrder.AuctionOrderService;

@Controller
public class RemoveAuctionOrderController {
	private AuctionOrderService auctionOrderS;

	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}

	@RequestMapping("auction/orderCancel")
	public ModelAndView removeAuctionOrder(
			@RequestParam("orderId") int orderId) throws Exception {

		this.auctionOrderS.updateStatus(orderId);
		
		Order order = this.auctionOrderS.getCancelInfo(orderId);
		ModelAndView mav = new ModelAndView("auctionOrderCancelInfo");
		mav.addObject("order", order);
		return mav;
	}

}
