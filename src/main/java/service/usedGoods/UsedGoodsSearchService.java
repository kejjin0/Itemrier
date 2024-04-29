package service.usedGoods;

import java.util.List;

import domain.usedGoods.UsedGoods;

public interface UsedGoodsSearchService {
    List<UsedGoods> searchUsedGoods(String searchWord);
}