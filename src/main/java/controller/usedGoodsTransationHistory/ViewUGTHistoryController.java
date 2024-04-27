package controller.usedGoodsTransationHistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;
import service.usedGoodsTransactionHistory.UGTHistoryService;

@Controller
public class ViewUGTHistoryController {
	private UGTHistoryService ugtHistoryS;
	
	@Autowired
	public void setUGTHistoryService(UGTHistoryService ugtHistoryS) {
		this.ugtHistoryS = ugtHistoryS;
	}
	
	@RequestMapping("/myPage/usedGoodsTransaction/")
	public ModelAndView handleRequest(
			@RequestParam("buyerId") int buyerId) throws Exception{
		
		List<UsedGoodsTransactionHistory> items = this.ugtHistoryS.getUsedGoodsBuyerHistory(buyerId);
		ModelAndView mav = new ModelAndView("purchasedUsedGoods");
		mav.addObject("items", items);
		return mav;
	}
	
}
