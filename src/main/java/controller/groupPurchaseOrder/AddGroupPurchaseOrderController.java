package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.groupPurchase.GroupPurchase;
import domain.order.Order;
import service.groupPurchase.GroupPurchaseService;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class AddGroupPurchaseOrderController {
	private GroupPurchaseOrderService gpOrderS;
	private GroupPurchaseService groupPurchaseS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
    @Autowired
    public void setGroupPurchaseService(GroupPurchaseService groupPurchase) {
        this.groupPurchaseS = groupPurchase;
    }
	
	@RequestMapping("/groupPurchase/orderForm")
	public String readyForWrite(
			@RequestParam("itemId") int itemId,
			Model model) throws Exception{
		GroupPurchase item = this.groupPurchaseS.getGroupPuuchaaseItemById(itemId);
		model.addAttribute("item", item);
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
	public String conformGroupPurchaseOrderInfo(
			@RequestParam("orderId") int orderId,
			Model model) throws Exception{
		
		Order order = this.gpOrderS.getCompletePaymentInfo(orderId);
		model.addAttribute("order", order);
		return "orderCompletionInfo";
	}
	
	
}
