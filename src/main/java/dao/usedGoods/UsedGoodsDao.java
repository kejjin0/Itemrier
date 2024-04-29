package dao.usedGoods;

import java.util.List;

import org.springframework.dao.DataAccessException;

import domain.usedGoods.UsedGoods;

public interface UsedGoodsDao {
    // 중고거래 상품 등록
    void insertUsedGoodItem(UsedGoods usedGood) throws DataAccessException;
    
    // 중고거래 상품 수정
    int updateUsedGoodItem(UsedGoods usedGood) throws DataAccessException;
    
    // 중고거래 상품 삭제
    int deleteUsedGoodItem(int itemId) throws DataAccessException;
    
    // 중고거래 상품 조회
    UsedGoods getUsedGoodById(int itemId) throws DataAccessException;
    
    // 중고거래 현황 변경
    void updateUsedGoodStatus(int itemId, String status) throws DataAccessException;
    
    
    /// 마이페이지에 필요
	// (판매) 사용자의 거래 내역 가져오기
	List<UsedGoods> getUsedGoodsInProgress(int sellerId) throws DataAccessException;
	
	// (판매) 거래 완료된 내역 가져오기
	List<UsedGoods> getUsedGoodsEnded(int sellerId) throws DataAccessException;
	//검색을 위함
    // 중고거래 상품 검색
    List<UsedGoods> searchUsedGoods(String searchWord);
}
