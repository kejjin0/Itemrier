package controller.usedGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.usedGoods.UsedGoods;
import service.usedGoods.UsedGoodsService;

@Controller
public class ViewUsedGoodsSalesInfoController {
	private UsedGoodsService usedGoodsS;
	
	@Autowired
	public void setUsedGoodsService(UsedGoodsService usedGoodsS) {
		this.usedGoodsS = usedGoodsS;
	}
	
	@RequestMapping("/myPage/usedGoodsTransaction/inProgress")
<<<<<<< HEAD
	public ModelAndView viewUsedGoodsInProgress(
			@RequestParam("sellerId") int sellerId) throws Exception{
=======
	public String viewUsedGoodsInProgress(
			@RequestParam("sellerId") int sellerId,
			ModelMap model) throws Exception{
>>>>>>> modify1
		
		List<UsedGoods> items = this.usedGoodsS.getUsedGoodsInProgress(sellerId);
		model.put("items", items);
		return "viewUsedGoodsInProgress";
	}
	
	@RequestMapping("/myPage/usedGoodsTransaction/ended")
<<<<<<< HEAD
	public ModelAndView viewUsedGoodsEnded(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<UsedGoods> items = this.usedGoodsS.getUsedGoodsEnded(sellerId);
		ModelAndView mav = new ModelAndView("viewUsedGoodsEnded");
		mav.addObject("items", items);
		return mav;
=======
	public String viewUsedGoodsEnded(
			@RequestParam("sellerId") int sellerId,
			ModelMap model) throws Exception{
		PagedListHolder<UsedGoods> items = new PagedListHolder<UsedGoods>(this.usedGoodsS.getUsedGoodsEnded(sellerId));
		items.setPageSize(15);
		model.put("items", items);
		return "viewUsedGoodsEnded";
>>>>>>> modify1
	}

	@RequestMapping("/myPage/usedGoodsTransaction/ended2")
	public String viewUsedGoodsEnded2(
			@RequestParam("page") String page,
			@ModelAttribute("items") PagedListHolder<UsedGoods> items,
			BindingResult result) throws Exception{
		if (items == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { items.nextPage(); }
		else if ("previous".equals(page)) { items.previousPage(); }
		return "viewUsedGoodsEnded";
	}
}
