package controller.groupPurchaseOrder;

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
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class AddGroupPurchaseOrderController {
	private GroupPurchaseOrderService gpOrderS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
	@RequestMapping("/groupPurchase/order")
	public String addGroupPurchaseOrder(
			@RequestParam("order") Order order) throws Exception{
		
		this.gpOrderS.insertGroupPurchaseOrder(order);
		return "groupPruchase/conformOrderInfo";
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
