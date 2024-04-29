package service.usedGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.usedGoods.UsedGoodsDao;
import domain.usedGoods.UsedGoods;

@Service("UsedGoodsServiceImpl")
public class UsedGoodsServiceImpl implements UsedGoodsService {
	@Autowired
	private UsedGoodsDao UGDao;
	
	// 중고거래 상품 등록
	public void insertUsedGoodItem(UsedGoods usedGood) {
		UGDao.insertUsedGoodItem(usedGood);
    }

    // 중고거래 상품 수정
    public int updateUsedGoodItem(UsedGoods usedGood) {
        return UGDao.updateUsedGoodItem(usedGood);
    }

    // 중고거래 상품 삭제
    public int deleteUsedGoodItem(int itemId) {
        return UGDao.deleteUsedGoodItem(itemId);
    }

    // 중고거래 상품 조회
    public UsedGoods getUsedGoodById(int itemId) {
        return UGDao.getUsedGoodById(itemId);
    }

    // 중고거래 현황 변경
    public void updateUsedGoodStatus(int itemId, String status) {
    	UGDao.updateUsedGoodStatus(itemId, status);
    }
	
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
