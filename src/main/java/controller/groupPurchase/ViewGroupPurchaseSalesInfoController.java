package controller.groupPurchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.groupPurchase.GroupPurchase;
import service.groupPurchase.GroupPurchaseService;

@Controller
public class ViewGroupPurchaseSalesInfoController {
	private GroupPurchaseService groupPurchaseS;
	
	@Autowired
	public void setGroupPurchaseService(GroupPurchaseService groupPurchaseS) {
		this.groupPurchaseS = groupPurchaseS;
	}
	
	@RequestMapping("/myPage/groupPruchase/inProgress")
	public ModelAndView viewGroupPurchaseInProgress(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<GroupPurchase> items = this.groupPurchaseS.getGroupPurchaseInProgress(sellerId);
		ModelAndView mav = new ModelAndView("GroupPurchaseInProgress");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping("/myPage/groupPurchase/ended")
	public ModelAndView viewGroupPurchaseEnded(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<GroupPurchase> items = this.groupPurchaseS.getGroupPurchaseEnded(sellerId);
		ModelAndView mav = new ModelAndView("GroupPurchaseEnded");
		mav.addObject("items", items);
		return mav;
	}
	
}
