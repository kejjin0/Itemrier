package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.auctionOrder.AuctionOrderService;

@Controller
public class ModifyAuctionOrder {
private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("myPage/auction/order/modify.do")
	public String ModifyBuyerInfo(
			@RequestParam("orderId")int orderId, 
			@RequestParam("buyerName") String buyerName, 
			@RequestParam("phoneNum") String phoneNum 
			) throws Exception{
		
		this.auctionOrderS.updateBuyerInfo(orderId, buyerName, phoneNum);
		return "myPage/auction/order/modify";
	}
	
	@RequestMapping("myPage/auction/order/modify.do")
	public String ModifyOrderDeliveryInfo(
			@RequestParam("orderId") int orderId, 
			@RequestParam("zipCode") int zipCode, 
			@RequestParam("addStreet") String addStreet, 
			@RequestParam("addDetail") String addDetail) throws Exception{
		
		this.auctionOrderS.updateDeliveryInfo(orderId, zipCode, addStreet, addDetail);
		return "myPage/auction/order/modify";
	}
	
	
}
