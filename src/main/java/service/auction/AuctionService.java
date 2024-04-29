package service.auction;

import java.util.List;

import domain.auction.Auction;

public interface AuctionService {
	// 경매 상품 등록
	public void insertAuctionItem(Auction auction);

	// 경매 상품 수정
    public int updateAuctionItem(Auction auction);

    // 경매 상품 삭제
    public int deleteAuctionItem(int itemId);

    // 셩매 상품 조회
    public Auction getAuctionById(int itemId);

    // 최고 입찰가 업데이트
    public void updateCurrentBid(int itemId, int newBid);

    // 경매 종료 후 현황 변경 및 낙찰자 저장
    public void endAuction(int itemId, String status, int winner);
	    
    ///마이 페이지 위함
	// (판매) 판매 중인 내역 확인
	List<Auction> getAuctionInProgress(int sellerId);
	
	// (판매) 판매 종료된 내역 확인
	List<Auction> getAuctionEnded(int sellerId);
}
