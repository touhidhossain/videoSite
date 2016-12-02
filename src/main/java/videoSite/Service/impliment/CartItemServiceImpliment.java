package videoSite.Service.impliment;

import videoSite.DAO.CartItemDAO;
import videoSite.Model.Cart;
import videoSite.Model.CartItem;
import videoSite.Service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 11/13/16.
 */
@Service
public class CartItemServiceImpliment implements CartItemService{
    @Autowired
    private CartItemDAO cartItemDAO;


    public void addCartItem(CartItem cartItem) {
        cartItemDAO.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDAO.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart) {
        cartItemDAO.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(long productId) {
        return cartItemDAO.getCartItemByProductId(productId);
    }
}
