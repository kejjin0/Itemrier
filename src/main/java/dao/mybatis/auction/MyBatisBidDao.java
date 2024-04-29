package dao.mybatis.auction;

import java.util.List;

import dao.mybatis.mapper.BidMapper;
import domain.auction.Bid;

public class MyBatisBidDao implements BidMapper {

    private BidMapper bidMapper;
    
    @Override
    public void insertAddBid(Bid bid) {
        bidMapper.insertAddBid(bid);
    }

    @Override
    public List<Bid> getBidsByItem(int itemId) {
        return bidMapper.getBidsByItem(itemId);
    }

    @Override
    public Bid getHighestBidByItem(int itemId) {
        return bidMapper.getHighestBidByItem(itemId);
    }
}
