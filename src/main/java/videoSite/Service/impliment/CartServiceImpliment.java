package videoSite.Service.impliment;

import videoSite.DAO.CartDAO;
import videoSite.Model.Cart;
import videoSite.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 10/23/16.
 */
@Service
public class CartServiceImpliment implements CartService{
    @Autowired
    private CartDAO cartDAO;

    @Override
    public Cart getCartById(int cartId) {
        return cartDAO.getCartById(cartId);
    }

    @Override
    public void update(Cart cart) {
        cartDAO.update(cart);
    }
}
