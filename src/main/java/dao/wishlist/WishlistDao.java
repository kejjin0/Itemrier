package dao.wishlist;
import domain.wishlist.Wishlist;
import java.util.List;

public interface WishlistDao {
	//찜 추가
	void addToWishlist(Wishlist wishlist);
	
	//찜 삭제
	void removeFromWishlist(Wishlist wishlist);
    
    //특정 유저의찜 목록 가져오기
	List<Wishlist> getWishlistByUserId(int userId);
    
    //찜한지 안한지 구분
	boolean isItemInWishlist(Wishlist wishlist);
}
