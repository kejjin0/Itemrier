package controller.groupPurchaseOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.groupPurchase.GroupPurchase;
import domain.order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class ViewGroupPurchaseOrderInfoController {
private GroupPurchaseOrderService groupPurchaseOrderS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseOrderService groupPurchaseOrderS) {
		this.groupPurchaseOrderS = groupPurchaseOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/orders")
	public String viewGroupPurchaseOrders(
			@RequestParam("buyerId") int buyerId,
			ModelMap model) throws Exception{
		PagedListHolder<GroupPurchase> items = new PagedListHolder<GroupPurchase>(this.groupPurchaseOrderS.getBuyGroupPurchase(buyerId));
		items.setPageSize(15);
		model.put("items", items);
		return "groupPurchaseOrders";
	}
	
	@RequestMapping("myPage/groupPurchase/orders2")
	public String viewGroupPurchaseOrders2(
			@RequestParam("page") String page,
			@ModelAttribute("items") PagedListHolder<GroupPurchase> items,
			BindingResult reulst) throws Exception{
		if (items == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { items.nextPage(); }
		else if ("previous".equals(page)) { items.previousPage(); }
		return "groupPurchaseOrders";
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
