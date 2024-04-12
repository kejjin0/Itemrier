package service.usedGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.usedGoods.UsedGoodsDao;
import domain.UsedGoods;

@Service("UsedGoodsServiceImpl")
public class UsedGoodsServiceImpl implements UsedGoodsService {
	@Autowired
	private UsedGoodsDao UGDao;
	
	
	
    /// 마이페이지에 필요
	// (판매) 사용자의 거래 내역 가져오기
	public List<UsedGoods> getUsedGoodsInProgress(int sellerId){
		return UGDao.getUsedGoodsInProgress(sellerId);
	}
	
	// (판매) 거래 완료된 내역 가져오기
	public List<UsedGoods> getUsedGoodsEnded(int sellerId){
		return UGDao.getUsedGoodsEnded(sellerId);
	}
}
