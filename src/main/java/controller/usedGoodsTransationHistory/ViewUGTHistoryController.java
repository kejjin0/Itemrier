package controller.usedGoodsTransationHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.usedGoodsTransactionHistory.UsedGoodsTransactionHistory;
import service.usedGoodsTransactionHistory.UGTHistoryService;

@Controller
public class ViewUGTHistoryController {
	private UGTHistoryService ugtHistoryS;
	
	@Autowired
	public void setUGTHistoryService(UGTHistoryService ugtHistoryS) {
		this.ugtHistoryS = ugtHistoryS;
	}
	
	@RequestMapping("/myPage/usedGoodsTransaction")
	public String viewUGTHistory(
			@RequestParam("buyerId") int buyerId,
			ModelMap model) throws Exception{
		
		PagedListHolder<UsedGoodsTransactionHistory> items = new PagedListHolder<UsedGoodsTransactionHistory>(this.ugtHistoryS.getUsedGoodsBuyerHistory(buyerId));
		items.setPageSize(15);
		model.put("items", items);
		return "purchasedUsedGoods";
	}
	
	@RequestMapping("/myPage/usedGoodsTransaction")
	public String viewAucitonEnded2(
			@RequestParam("page") String page,
			@ModelAttribute("items") PagedListHolder<UsedGoodsTransactionHistory> items,
			BindingResult reulst) throws Exception{
		if (items == null) {
			throw new IllegalStateException("Cannot find pre-loaded items");
		}
		if("next".equals(page)) { items.nextPage(); }
		else if ("previous".equals(page)) { items.previousPage(); }
		return "purchasedUsedGoods";
	}
	
}
