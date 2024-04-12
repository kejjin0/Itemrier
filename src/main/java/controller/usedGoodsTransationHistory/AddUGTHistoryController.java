package controller.usedGoodsTransationHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/myPage/addUGTHistory.do")
	public String handleRequest(
			@RequestParam("ugtHistory") UsedGoodsTransactionHistory ugtHistory) throws Exception{
		
		this.ugtHistoryS.insertUsedGoodsTransactionHistory(ugtHistory);
		return "myPage/buy";
	}
	
	
}
