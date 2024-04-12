package service.usedGoods;

import java.util.List;

import domain.usedGoods.UsedGoods;

public interface UsedGoodsService {
    /// 마이페이지에 필요
	// (판매) 사용자의 거래 내역 가져오기
	List<UsedGoods> getUsedGoodsInProgress(int sellerId);
	
	// (판매) 거래 완료된 내역 가져오기
	List<UsedGoods> getUsedGoodsEnded(int sellerId);
}
