package videoSite.Service;

import videoSite.Model.Cart;
import videoSite.Model.CartItem;

/**
 * Created by root on 11/13/16.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(long productId);
}
