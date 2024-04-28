package controller.usedGoodsTransationHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;
import service.usedGoodsTransactionHistory.UGTHistoryService;

@Controller
public class AddUGTHistoryController {
	private UGTHistoryService ugtHistoryS;
	
	@Autowired
	public void setUGTHistoryService(UGTHistoryService ugtHistoryS) {
		this.ugtHistoryS = ugtHistoryS;
	}
	
	@RequestMapping("/usedGoods/transactionForm")
	public String readyForWrite(
			@RequestParam("itemId") int itemId) throws Exception{
		// usedGoods service
		// service로부터 usedGoods 물품 찾기
		// usedGoods 물품 저장
		return "UsedGoodsTransactionForm";
	}
	
	@RequestMapping("/usedGoods/addUGTHistory")
	public String addUGTHistory(
			@RequestParam("ugtHistory") UsedGoodsTransactionHistory ugtHistory,
			Model model) throws Exception{
		
		this.ugtHistoryS.insertUsedGoodsTransactionHistory(ugtHistory);
		model.addAttribute("sellerId", ugtHistory.getSellerId());
		return "redirect:/myPage/usedGoodsTransaction/ended";
	}
	
}
