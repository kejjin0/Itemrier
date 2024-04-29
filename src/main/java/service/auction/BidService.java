package service.auction;

import java.util.List;

import domain.auction.Bid;

public interface BidService {
	// 입찰
    void insertAddBid(Bid bid);
    
    // 상품에 대한 모든 입찰 내역 조회
    List<Bid> getBidsByItem(int itemId);
    
    // 특정 상품에 대한 최고 입찰액 조회
    Bid getHighestBidByItem(int itemId);
}
