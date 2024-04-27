package controller.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.Order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class ViewGroupPurchaseOrderInfoController {
private GroupPurchaseOrderService groupPurchaseOrderS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseOrderService groupPurchaseOrderS) {
		this.groupPurchaseOrderS = groupPurchaseOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/orders")
	public ModelAndView viewGroupPurchaseOrders(
			@RequestParam("buyerId") int buyerId) throws Exception{
		
		List<Order> items = this.groupPurchaseOrderS.getBuyGroupPurchase(buyerId);
		ModelAndView mav = new ModelAndView("groupPurchaseOrders");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping("myPage/groupPurchase/detailOrderInfo")
	public ModelAndView viewGroupPurchaseOrderDetail(
			@RequestParam("orderId") int orderId) throws Exception{
		
		Order order = this.groupPurchaseOrderS.getGroupPurchaseOrderDetailInfo(orderId);
		ModelAndView mav = new ModelAndView("groupPurchaseOrderDetail");
		mav.addObject("order", order);
		return mav;
	}
	
	
}
