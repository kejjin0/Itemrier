package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class ModifyGroupPurchaseOrderController {
private GroupPurchaseOrderService groupPurchaseOrderS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseOrderService groupPurchaseOrderS) {
		this.groupPurchaseOrderS = groupPurchaseOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/order/buyerInfoModifyForm")
	public String ModifyBuyerInfo(
			@RequestParam("order")Order order,
			Model model) throws Exception{
		
		this.groupPurchaseOrderS.updateBuyerInfo(order);
		model.addAttribute("orderId", order.getOrderId());
		return "redirect:/myPage/groupPurchase/order/detailOrderInfo";
	}
	
	@RequestMapping("myPage/groupPurchase/order/deliveryInfoModifyForm")
	public String ModifyOrderDeliveryInfo(
			@RequestParam("order") Order order,
			Model model) throws Exception{
		
		this.groupPurchaseOrderS.updateDeliveryInfo(order);
		model.addAttribute("orderId", order.getOrderId());
		return "redirect:/myPage/groupPurchase/order/detailOrderInfo";
	}
}
