package service.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.auction.AuctionDao;
import domain.auction.Auction;

@Service("AuctionServiceImpl")
public class AuctionServiceImpl implements AuctionService{
	@Autowired
	private AuctionDao auctionDao;
	
	
	///마이 페이지 위함
	// (판매) 판매 중인 내역 확인
    public List<Auction> getAuctionInProgress(int sellerId){
		return auctionDao.getAuctionInProgress(sellerId);
	}
	
	// (판매) 판매 종료된 내역 확인
	public List<Auction> getAuctionEnded(int sellerId){
		return auctionDao.getAuctionEnded(sellerId);
	}

}
