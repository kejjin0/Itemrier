package controller.groupPurchaseOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String viewGroupPurchaseBuyersInfo(
			@RequestParam("itemId") int itemId,
			ModelMap model) throws Exception{
		List<Order> list = this.gpOrderS.getGroupPurchaseOrderBuyersInfo(itemId);
		PagedListHolder<Order> buyers = new PagedListHolder<Order>(list);
		buyers.setPageSize(15);
		model.put("buyers", buyers);
		return "groupPurchaseBuyersInfo";
	}
	
	@RequestMapping("myPage/groupPurchase/buyersInfo2")
	public String viewGroupPurchaseBuyersInfo2(
			@RequestParam("page") String page,
			@ModelAttribute("buyers") PagedListHolder<Order> buyers,
			BindingResult result) throws Exception{
		if (buyers == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { buyers.nextPage(); }
		else if ("previous".equals(page)) { buyers.previousPage(); }
		return "groupPurchaseBuyersInfo";
	}
	
	@RequestMapping("myPage/groupPurchase/updateInvoiceNumber")
	public String updateGroupPurchaseInvoiceNumber(
			@RequestParam("order") Order order,
			Model model) throws Exception{
		
		this.gpOrderS.updateInvoiceNumberInfo(order);
		model.addAttribute("itemId", order.getOrderId());
		return "redirect:/myPage/groupPurchase/buyersInfo";
	}
	
	
}
