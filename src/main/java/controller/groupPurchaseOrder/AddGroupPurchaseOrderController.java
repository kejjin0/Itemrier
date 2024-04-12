package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.groupPurchaseOrder.GroupPurchaseOrder;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class AddGroupPurchaseOrderController {
	private GroupPurchaseOrderService gpOrderS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
	@RequestMapping("/groupPurchase/order.do")
	public String addGroupPurchaseOrder(
			@RequestParam("order") GroupPurchaseOrder order) throws Exception{
		
		this.gpOrderS.insertGroupPurchaseOrder(order);
		return "groupPruchase/conformOrderInfo";
	}
	
	@RequestMapping("/groupPurchase/conformOrderInfo.do")
	public ModelAndView conformGroupPurchaseOrderInfo(
			@RequestParam("orderId") int orderId) throws Exception{
		
		GroupPurchaseOrder order = this.gpOrderS.getCompletePaymentInfo(orderId);
		ModelAndView mav = new ModelAndView("viewGroupPurchaseOrderInfo");
		mav.addObject("order", order);
		return mav;
	}
	
	
}
