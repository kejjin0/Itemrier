package service.usedGoods;

import java.util.List;

import org.springframework.dao.DataAccessException;

import domain.usedGoods.UsedGoods;

public interface UsedGoodsService {
	// 중고거래 상품 등록
    void insertUsedGoodItem(UsedGoods usedGood);
    
    // 중고거래 상품 수정
    int updateUsedGoodItem(UsedGoods usedGood);
    
    // 중고거래 상품 삭제
    int deleteUsedGoodItem(int itemId);
    
    // 중고거래 상품 조회
    UsedGoods getUsedGoodById(int itemId);
    
    // 중고거래 현황 변경
    void updateUsedGoodStatus(int itemId, String status);
    
    /// 마이페이지에 필요
	// (판매) 사용자의 거래 내역 가져오기
	List<UsedGoods> getUsedGoodsInProgress(int sellerId);
	
	// (판매) 거래 완료된 내역 가져오기
	List<UsedGoods> getUsedGoodsEnded(int sellerId);
}
