package controller.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.wishlist.*;
import service.wishlist.*;

@RequestMapping("/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addToWishlist(@RequestBody Wishlist wishlist) {
    	wishlistService.addToWishlist(wishlist);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public void removeFromWishlist(@RequestBody Wishlist wishlist) {
    	wishlistService.removeFromWishlist(wishlist);
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Wishlist> getWishlistByUserId(@RequestBody int userId) {
        return wishlistService.getWishlistByUserId(userId);
    }
}