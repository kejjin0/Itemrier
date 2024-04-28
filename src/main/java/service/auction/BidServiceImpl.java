package service.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.auction.BidDao;
import domain.auction.Bid;

@Service("BidServiceImpl")
public class BidServiceImpl implements BidService {
	@Autowired
	private BidDao bidDao;
	
	@Override
	public void insertAddBid(Bid bid) {
		bidDao.insertAddBid(bid);
	}

	@Override
	public List<Bid> getBidsByItem(int itemId) {
		return bidDao.getBidsByItem(itemId);
	}

	@Override
	public Bid getHighestBidByItem(int itemId) {
		return bidDao.getHighestBidByItem(itemId);
	}
}
