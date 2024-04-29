package dao.mybatis.mapper;

import java.util.List;

import domain.wishlist.Wishlist;

public interface WishlistMapper {
	void addToWishlist(Wishlist wishlist);
    void removeFromWishlist(Wishlist wishlist);
    List<Wishlist> getWishlistByUserId(int userId);
    boolean isItemInWishlist(Wishlist wishlist);
}
