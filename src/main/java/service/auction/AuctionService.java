package service.auction;

import java.util.List;

import domain.Auction;

public interface AuctionService {
    ///마이 페이지 위함
	// (판매) 판매 중인 내역 확인
	List<Auction> getAuctionInProgress(int sellerId);
	
	// (판매) 판매 종료된 내역 확인
	List<Auction> getAuctionEnded(int sellerId);
}
