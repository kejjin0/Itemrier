package service.wishlist;

import java.util.List;
import domain.wishlist.Wishlist;

public interface WishlistService {
	// 상품을 찜하기
	void addToWishlist(Wishlist wishlist);

	// 찜 목록에서 상품 제거하기
	void removeFromWishlist(Wishlist wishlist);

	// 사용자의 찜 목록 조회하기
	List<Wishlist> getWishlistByUserId(int userId);

	// 찜 여부 확인하기
	boolean isItemInWishlist(Wishlist wishlist);
}
