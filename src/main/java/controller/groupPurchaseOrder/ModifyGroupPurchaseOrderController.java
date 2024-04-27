package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.Order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class ModifyGroupPurchaseOrderController {
private GroupPurchaseOrderService groupPurchaseOrderS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseOrderService groupPurchaseOrderS) {
		this.groupPurchaseOrderS = groupPurchaseOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/order/BuyerInfoModifyForm")
	public String ModifyBuyerInfo(
			@RequestParam("order")Order order
			) throws Exception{
		
		this.groupPurchaseOrderS.updateBuyerInfo(order);
		return "myPage/groupPurchase/order/modify";
	}
	
	@RequestMapping("myPage/groupPurchase/order/deliveryInfoModifyForm")
	public String ModifyOrderDeliveryInfo(
			@RequestParam("order") Order order) throws Exception{
		
		this.groupPurchaseOrderS.updateDeliveryInfo(order);
		return "myPage/groupPurchase/order/modify";
	}
}
