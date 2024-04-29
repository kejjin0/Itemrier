package service.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.wishlist.*;
import domain.wishlist.*;

@Service
public class WishlistServiceImpl implements WishlistService {

    @Autowired
    private WishlistDao wishlistDao;

    @Override
    public void addToWishlist(Wishlist wishlist) {
    	wishlistDao.addToWishlist(wishlist);
    }

    @Override
    public void removeFromWishlist(Wishlist wishlist) {
    	wishlistDao.removeFromWishlist(wishlist);
    }

    @Override
    public List<Wishlist> getWishlistByUserId(int userId) {
        return wishlistDao.getWishlistByUserId(userId);
    }

    @Override
    public boolean isItemInWishlist(Wishlist wishlist) {
        return wishlistDao.isItemInWishlist(wishlist);
    }
}