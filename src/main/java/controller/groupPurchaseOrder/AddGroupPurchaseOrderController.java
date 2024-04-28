package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class AddGroupPurchaseOrderController {
	private GroupPurchaseOrderService gpOrderS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
	@RequestMapping("/groupPurchase/orderForm")
	public String readyForWrite(
			@RequestParam("itemId") int itemId) throws Exception{
		// groupPurchase service
		// service로부터 groupPurchase 물품 찾기
		// groupPurchase 물품 저장
		return "groupPurchaseOrderForm";
	}
	
	@RequestMapping("/groupPurchase/order")
	public String addGroupPurchaseOrder(
			@RequestParam("order") Order order,
			Model model) throws Exception{
		
		this.gpOrderS.insertGroupPurchaseOrder(order);
		model.addAttribute("orderId", order.getOrderId());
		return "redirect:/groupPruchase/conformOrderInfo";
	}
	
	@RequestMapping("/groupPurchase/conformOrderInfo")
	public ModelAndView conformGroupPurchaseOrderInfo(
			@RequestParam("orderId") int orderId) throws Exception{
		
		Order order = this.gpOrderS.getCompletePaymentInfo(orderId);
		ModelAndView mav = new ModelAndView("viewGroupPurchaseOrderInfo");
		mav.addObject("order", order);
		return mav;
	}
	
	
}
