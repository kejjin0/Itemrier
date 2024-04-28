package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String removeAuctionOrder(
			@RequestParam("orderId") int orderId,
			Model model) throws Exception {

		this.gpOrderS.updateStatus(orderId);
		
		Order order = this.gpOrderS.getCancelInfo(orderId);
		model.addAttribute("order", order);
		return "grupPurchaseOrderCancelInfo";
	}
}
