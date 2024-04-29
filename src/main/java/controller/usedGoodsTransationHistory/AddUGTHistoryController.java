package controller.usedGoodsTransationHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.usedGoods.UsedGoods;
import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;
import service.usedGoods.UsedGoodsService;
import service.usedGoodsTransactionHistory.UGTHistoryService;

@Controller
public class AddUGTHistoryController {
	private UGTHistoryService ugtHistoryS;
	private UsedGoodsService usedGoodsS;
	
	@Autowired
	public void setUGTHistoryService(UGTHistoryService ugtHistoryS) {
		this.ugtHistoryS = ugtHistoryS;
	}
	
	@Autowired
	public void setUsedGoodsService(UsedGoodsService usedGoodsS) {
		this.usedGoodsS = usedGoodsS;
	}
	
	@RequestMapping("myPage/usedGoods/transactionForm")
	public String readyForWrite(
			@RequestParam("itemId") int itemId,
			Model model) throws Exception{
		UsedGoods item = usedGoodsS.getUsedGoodById(itemId);
		model.addAttribute("item", item);
		return "usedGoodsTransactionForm";
	}
	
	@RequestMapping("myPage/usedGoods/addUGTHistory")
	public String addUGTHistory(
			@RequestParam("ugtHistory") UsedGoodsTransactionHistory ugtHistory,
			Model model) throws Exception{
		
		this.ugtHistoryS.insertUsedGoodsTransactionHistory(ugtHistory);
		model.addAttribute("sellerId", ugtHistory.getSellerId());
		return "redirect:/myPage/usedGoodsTransaction/ended";
	}
	
}
