package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class RemoveGroupPurchaseOrderController {
private GroupPurchaseOrderService gpOrderS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
	@RequestMapping("groupPurchase/orderCancel")
	public ModelAndView removeAuctionOrder(
			@RequestParam("orderId") int orderId) throws Exception {

		this.gpOrderS.updateStatus(orderId);
		
		Order order = this.gpOrderS.getCancelInfo(orderId);
		ModelAndView mav = new ModelAndView("grupPurchaseOrderCancelInfo");
		mav.addObject("order", order);
		return mav;
	}
}
