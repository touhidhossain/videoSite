package videoSite.Service;

import videoSite.Model.Product;

import java.util.List;

/**
 * Created by root on 10/13/16.
 */
public interface ProductService {
    List<Product> getProductList();
    Product getProductById(long id);
    void addProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(Product product);
}
