package videoSite.DAO;

import videoSite.Model.Product;

import java.util.List;

/**
 * Created by TOUHID on 7/9/2016.
 */
public interface ProductDAO {
    List<Product> getProductList();
    Product getProductById(long id);
    void addProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(Product product);
}
