package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
import domain.Order.Order;
=======
import domain.order.Order;
>>>>>>> modify1
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
			@RequestParam("order")Order order
			) throws Exception{
		
		this.auctionOrderS.updateBuyerInfo(order);
		return "auctionOrderDetail";
	}
	
	@RequestMapping("myPage/auction/order/deliveryInfoModifyForm")
	public String ModifyOrderDeliveryInfo(
			@RequestParam("order") Order order) throws Exception{
		
		this.auctionOrderS.updateDeliveryInfo(order);
		return "auctionOrderDetail";
	}
	
	
}
