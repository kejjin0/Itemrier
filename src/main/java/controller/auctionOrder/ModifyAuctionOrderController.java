package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.order.Order;
import service.auctionOrder.AuctionOrderService;

@Controller
public class ModifyAuctionOrderController {
private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("myPage/auction/order/buyerInfoModifyForm")
	public String ModifyBuyerInfo(
			@RequestParam("order")Order order,
				Model model) throws Exception{
		
		this.auctionOrderS.updateBuyerInfo(order);
		model.addAttribute("orderId", order.getOrderId());
		return "redirect://myPage/auction/detailOrderInfo";
	}
	
	@RequestMapping("myPage/auction/order/deliveryInfoModifyForm")
	public String ModifyOrderDeliveryInfo(
			@RequestParam("order") Order order,
			Model model) throws Exception{
		
		this.auctionOrderS.updateDeliveryInfo(order);
		model.addAttribute("orderId", order.getOrderId());
		return "redirect://myPage/auction/detailOrderInfo";
	}
	
	
}
