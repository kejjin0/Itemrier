package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String removeAuctionOrder(
			@RequestParam("orderId") int orderId,
			Model model) throws Exception {

		this.auctionOrderS.updateStatus(orderId);
		
		Order order = this.auctionOrderS.getCancelInfo(orderId);
		model.addAttribute("order", order);
		return "auctionOrderCancelInfo";
	}

}
