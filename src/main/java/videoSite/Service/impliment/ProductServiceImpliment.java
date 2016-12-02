package videoSite.Service.impliment;

import videoSite.DAO.ProductDAO;
import videoSite.Model.Product;
import videoSite.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by root on 10/13/16.
 */
@Service
public class ProductServiceImpliment implements ProductService{
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getProductList() {
        return productDAO.getProductList();
    }

    @Override
    public Product getProductById(long productId) {
        return productDAO.getProductById(productId);
    }

    @Override
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    @Override
    public void editProduct(Product product) {
        productDAO.editProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productDAO.deleteProduct(product);
    }
}
