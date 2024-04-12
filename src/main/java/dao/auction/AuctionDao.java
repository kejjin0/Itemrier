package dao.auction;

import java.util.List;

import org.springframework.dao.DataAccessException;

import domain.Auction;

public interface AuctionDao {
    // 경매 상품 등록
    void insertAuctionItem(Auction auction) throws DataAccessException;
    
    // 경매 상품 수정
    int updateAuctionItem(Auction auction) throws DataAccessException;
    
    // 경매 상품 삭제
    int deleteAuctionItem(int itemId) throws DataAccessException;
    
    // 경매 상품 조회
    Auction getAuctionById(int itemId) throws DataAccessException;
    
    // 최고 입찰가 업데이트
    void updateCurrentBid(int itemId, int newBid) throws DataAccessException;
    
    // 경매 종료 후 현황 변경 및 낙찰자 저장
    void endAuction(int itemId, String status, int winner) throws DataAccessException;
    
    
    ///마이 페이지 위함
	// (판매) 판매 중인 내역 확인
	List<Auction> getAuctionInProgress(int sellerId) throws DataAccessException;
	
	// (판매) 판매 종료된 내역 확인
	List<Auction> getAuctionEnded(int sellerId) throws DataAccessException;
}
