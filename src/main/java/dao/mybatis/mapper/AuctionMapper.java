package dao.mybatis.mapper;

import java.util.List;

import domain.Auction;

public interface AuctionMapper {
    // 경매 상품 등록
    void insertAuctionItem(Auction auction);
    
    // 경매 상품 수정
    int updateAuctionItem(Auction auction);
    
    // 경매 상품 삭제
    int deleteAuctionItem(int itemId);
    
    // 경매 상품 조회
    Auction getAuctionById(int itemId);
    
    // 최고 입찰가 업데이트
    void updateCurrentBid(int itemId, int newBid);
    
    // 경매 종료 후 현황 변경 및 낙찰자 저장
    void endAuction(int itemId, int winner);
    
    
    ///마이 페이지 위함
	// (판매) 판매 중인 내역 확인
	List<Auction> getAuctionInProgress(int sellerId);
	
	// (판매) 판매 종료된 내역 확인
	List<Auction> getAuctionEnded(int sellerId);
}
