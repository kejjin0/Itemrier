package controller.auctionOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.order.Order;
import service.auctionOrder.AuctionOrderService;

@Controller
public class AddAuctionOrderController {
	private AuctionOrderService auctionOrderS;
	
	@Autowired
	public void setAuctionOrderService(AuctionOrderService auctionOrderS) {
		this.auctionOrderS = auctionOrderS;
	}
	
	@RequestMapping("/auction/orderForm")
	public String readyForWrite(
			@RequestParam("itemId") int itemId) throws Exception{
		// auction service
		// service로부터 auction 물품 찾기
		// auction 물품 저장
		return "auctionOrderForm";
	}
	
	@RequestMapping("/auction/order")
	public String initNewAuctionOrder(
			@RequestParam("order") Order order,
			Model model) throws Exception{
		
		this.auctionOrderS.insertAuctionOrder(order);
		model.addAttribute("orderId", order.getOrderId());
		return "redirect:/auction/conformOrderInfo";
	}
	
	@RequestMapping("/auction/conformOrderInfo")
	public ModelAndView conformAuctionOrderInfo(
			@RequestParam("orderId") int orderId) throws Exception{
		
		Order order = this.auctionOrderS.getCompletePaymentInfo(orderId);
		ModelAndView mav = new ModelAndView("viewAuctionOrderInfo");
		mav.addObject("order", order);
		return mav;
	}
	
}
