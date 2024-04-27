package controller.usedGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView viewUsedGoodsInProgress(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<UsedGoods> items = this.usedGoodsS.getUsedGoodsInProgress(sellerId);
		ModelAndView mav = new ModelAndView("viewUsedGoodsInProgress");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping("/myPage/usedGoodsTransaction/ended")
	public ModelAndView viewUsedGoodsEnded(
			@RequestParam("sellerId") int sellerId) throws Exception{
		
		List<UsedGoods> items = this.usedGoodsS.getUsedGoodsEnded(sellerId);
		ModelAndView mav = new ModelAndView("viewUsedGoodsEnded");
		mav.addObject("items", items);
		return mav;
	}

}
