//중고거래 상품 검색
package service.usedGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.usedGoods.*;
import domain.usedGoods.UsedGoods;

public class UsedGoodsSearchServiceImpl implements UsedGoodsSearchService {
	@Autowired
	private UsedGoodsDao usedGoodsDao;

	@Override
	public List<UsedGoods> searchUsedGoods(String searchWord) {
		return usedGoodsDao.searchUsedGoods(searchWord);
	}

}
