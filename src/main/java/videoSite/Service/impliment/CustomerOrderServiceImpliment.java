package videoSite.Service.impliment;

import videoSite.DAO.CustomerOrderDAO;
import videoSite.Model.Cart;
import videoSite.Model.CartItem;
import videoSite.Model.CustomerOrder;
import videoSite.Service.CartService;
import videoSite.Service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by root on 11/19/16.
 */
@Service
public class CustomerOrderServiceImpliment implements CustomerOrderService{
    @Autowired
    private CustomerOrderDAO customerOrderDAO;

    @Autowired
    private CartService cartService;
    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDAO.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for(CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }
}
