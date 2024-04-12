package dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import dao.mybatis.mapper.AuctionMapper;
import domain.Auction;

public class MyBatisAuctionDao implements AuctionMapper {
	@Autowired
    private AuctionMapper auctionMapper;
    
    @Override
    public void insertAuctionItem(Auction auction)  throws DataAccessException{
        auctionMapper.insertAuctionItem(auction);
    }

    @Override
    public int updateAuctionItem(Auction auction) throws DataAccessException {
        return auctionMapper.updateAuctionItem(auction);
    }

    @Override
    public int deleteAuctionItem(int itemId) throws DataAccessException {
        return auctionMapper.deleteAuctionItem(itemId);
    }

    @Override
    public Auction getAuctionById(int itemId) throws DataAccessException {
        return auctionMapper.getAuctionById(itemId);
    }

    @Override
    public void updateCurrentBid(int itemId, int newBid) throws DataAccessException {
        auctionMapper.updateCurrentBid(itemId, newBid);
    }

    @Override
    public void endAuction(int itemId, int winner) throws DataAccessException {
        auctionMapper.endAuction(itemId, winner);
    }
    
    
    /// 마이페이지 위함
	// (판매) 판매 중인 내역 확인
	public List<Auction> getAuctionInProgress(int sellerId) throws DataAccessException{
		return auctionMapper.getAuctionInProgress(sellerId);
	}
	
	// (판매) 판매 종료된 내역 확인
	public List<Auction> getAuctionEnded(int sellerId) throws DataAccessException {
		return auctionMapper.getAuctionEnded(sellerId);
	}
}