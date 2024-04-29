package dao.mybatis.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.wishlist.WishlistDao;
import dao.mybatis.mapper.WishlistMapper;
import domain.wishlist.Wishlist;

public class MybatisWishlistDao implements WishlistDao {

	@Autowired
	private WishlistMapper wishlistMapper;

	@Override
	public void addToWishlist(Wishlist wishlist) {
		wishlistMapper.addToWishlist(wishlist);
	}

	@Override
	public void removeFromWishlist(Wishlist wishlist) {
		wishlistMapper.removeFromWishlist(wishlist);

	}

	@Override
	public List<Wishlist> getWishlistByUserId(int userId) {
		return wishlistMapper.getWishlistByUserId(userId);
	}

	@Override
	public boolean isItemInWishlist(Wishlist wishlist) {
		return wishlistMapper.isItemInWishlist(wishlist);
	}

}
