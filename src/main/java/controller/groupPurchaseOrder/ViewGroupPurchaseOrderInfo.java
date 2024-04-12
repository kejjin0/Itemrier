package controller.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.GroupPurchaseOrder;
import service.GroupPurchaseOrderService;

@Controller
public class ViewGroupPurchaseOrderInfo {
private GroupPurchaseOrderService groupPurchaseOrderS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseOrderService groupPurchaseOrderS) {
		this.groupPurchaseOrderS = groupPurchaseOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/orders")
	public ModelAndView viewGroupPurchaseOrders(
			@RequestParam("buyerId") int buyerId) throws Exception{
		
		List<GroupPurchaseOrder> items = this.groupPurchaseOrderS.getBuyGroupPurchase(buyerId);
		ModelAndView mav = new ModelAndView("groupPurchaseOrders");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping("myPage/groupPurchase/detailOrderInfo")
	public ModelAndView viewGroupPurchaseOrderDetail(
			@RequestParam("orderId") int orderId) throws Exception{
		
		GroupPurchaseOrder order = this.groupPurchaseOrderS.getGroupPurchaseOrderDetailInfo(orderId);
		ModelAndView mav = new ModelAndView("groupPurchaseOrderDetail");
		mav.addObject("order", order);
		return mav;
	}
	
	
}
