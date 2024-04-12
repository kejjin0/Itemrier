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
public class ViewGroupPurchaseBuyersInfo {
private GroupPurchaseOrderService gpOrderS;
	
	@Autowired
	public void setGroupPurchaseOrderService(GroupPurchaseOrderService gpOrderS) {
		this.gpOrderS = gpOrderS;
	}
	
	@RequestMapping("myPage/groupPurchase/buyersInfo.do")
	public ModelAndView viewGroupPurchaseBuyersInfo(
			@RequestParam("itemId") int itemId) throws Exception{
		
		List<GroupPurchaseOrder> buyers = this.gpOrderS.getGroupPurchaseOrderBuyersInfo(itemId);
		ModelAndView mav = new ModelAndView("groupPurchaseBuyersInfo");
		mav.addObject("buyers", buyers);
		return mav;
	}
	
	@RequestMapping("myPage/groupPurchase/updateInvoiceNumber")
	public String updateGroupPurchaseInvoiceNumber(
			@RequestParam("itemId") int itemId,
			@RequestParam("orderId") int orderId, 
			@RequestParam("invoiceNumber") int invoiceNumber) throws Exception{
		
		this.gpOrderS.updateInvoiceNumberInfo(orderId, invoiceNumber);
		
		return "myPage/groupPurchase/buyersInfo";
	}
	
	
}
