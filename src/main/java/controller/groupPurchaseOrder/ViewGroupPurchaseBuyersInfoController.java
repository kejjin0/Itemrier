package controller.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.order.Order;
import service.groupPurchaseOrder.GroupPurchaseOrderService;

@Controller
public class ViewGroupPurchaseBuyersInfoController {
private GroupPurchaseOrderService gpOrderS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/buyersInfo")
	public ModelAndView viewGroupPurchaseBuyersInfo(
			@RequestParam("itemId") int itemId) throws Exception{
		
		List<Order> buyers = this.gpOrderS.getGroupPurchaseOrderBuyersInfo(itemId);
		ModelAndView mav = new ModelAndView("groupPurchaseBuyersInfo");
		mav.addObject("buyers", buyers);
		return mav;
	}
	
	@RequestMapping("myPage/groupPurchase/updateInvoiceNumber")
	public String updateGroupPurchaseInvoiceNumber(
			@RequestParam("order") Order order) throws Exception{
		
		this.gpOrderS.updateInvoiceNumberInfo(order);
		
		return "myPage/groupPurchase/buyersInfo";
	}
	
	
}
