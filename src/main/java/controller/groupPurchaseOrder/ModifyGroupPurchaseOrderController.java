package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class ModifyGroupPurchaseOrderController {
private GroupPurchaseOrderService groupPurchaseOrderS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseOrderService groupPurchaseOrderS) {
		this.groupPurchaseOrderS = groupPurchaseOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/order/modify.do")
	public String ModifyBuyerInfo(
			@RequestParam("orderId")int orderId, 
			@RequestParam("buyerName") String buyerName, 
			@RequestParam("phoneNum") String phoneNum 
			) throws Exception{
		
		this.groupPurchaseOrderS.updateBuyerInfo(orderId, buyerName, phoneNum);
		return "myPage/groupPurchase/order/modify";
	}
	
	@RequestMapping("myPage/groupPurchase/order/modify.do")
	public String ModifyOrderDeliveryInfo(
			@RequestParam("orderId") int orderId, 
			@RequestParam("zipCode") int zipCode, 
			@RequestParam("addStreet") String addStreet, 
			@RequestParam("addDetail") String addDetail) throws Exception{
		
		this.groupPurchaseOrderS.updateDeliveryInfo(orderId, zipCode, addStreet, addDetail);
		return "myPage/groupPurchase/order/modify";
	}
}
