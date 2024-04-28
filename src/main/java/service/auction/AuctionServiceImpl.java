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
	
	// 경매 상품 등록
	public void insertAuctionItem(Auction auction) {
        auctionDao.insertAuctionItem(auction);
    }

	// 경매 상품 수정
    public int updateAuctionItem(Auction auction) {
        return auctionDao.updateAuctionItem(auction);
    }

    // 경매 상품 삭제
    public int deleteAuctionItem(int itemId) {
        return auctionDao.deleteAuctionItem(itemId);
    }

    // 셩매 상품 조회
    public Auction getAuctionById(int itemId) {
        return auctionDao.getAuctionById(itemId);
    }

    // 최고 입찰가 업데이트
    public void updateCurrentBid(int itemId, int newBid) {
        auctionDao.updateCurrentBid(itemId, newBid);
    }

    // 경매 종료 후 현황 변경 및 낙찰자 저장
    public void endAuction(int itemId, String status, int winner) {
        auctionDao.endAuction(itemId, status, winner);
    }
	
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
