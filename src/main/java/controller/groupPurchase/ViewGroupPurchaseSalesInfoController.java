package controller.groupPurchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
<<<<<<< HEAD
	public ModelAndView viewGroupPurchaseInProgress(
			@RequestParam("sellerId") int sellerId) throws Exception{
=======
	public String viewGroupPurchaseInProgress(
			@RequestParam("sellerId") int sellerId,
			ModelMap model) throws Exception{
>>>>>>> modify1
		
		List<GroupPurchase> items = this.groupPurchaseS.getGroupPurchaseInProgress(sellerId);
		model.put("items", items);
		return "GroupPurchaseInProgress";
	}
	
	@RequestMapping("/myPage/groupPurchase/ended")
<<<<<<< HEAD
	public ModelAndView viewGroupPurchaseEnded(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<GroupPurchase> items = this.groupPurchaseS.getGroupPurchaseEnded(sellerId);
		ModelAndView mav = new ModelAndView("GroupPurchaseEnded");
		mav.addObject("items", items);
		return mav;
=======
	public String viewGroupPurchaseEnded(
			@RequestParam("sellerId") int sellerId,
			ModelMap model) throws Exception{
		PagedListHolder<GroupPurchase> items = new PagedListHolder<GroupPurchase>(this.groupPurchaseS.getGroupPurchaseEnded(sellerId));
		items.setPageSize(15);
		model.put("items", items);
		return "GroupPurchaseEnded";
>>>>>>> modify1
	}
	
	@RequestMapping("/myPage/groupPurchase/ended2")
	public String viewGroupPurchaseEnded2(
			@RequestParam("page") String page,
			@ModelAttribute("items") PagedListHolder<GroupPurchase> items,
			BindingResult result) throws Exception{
		if (items == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { items.nextPage(); }
		else if ("previous".equals(page)) { items.previousPage(); }
		return "GroupPurchaseEnded";
	}	
}
