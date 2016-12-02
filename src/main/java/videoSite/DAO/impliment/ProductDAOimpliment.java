package videoSite.DAO.impliment;

import videoSite.DAO.ProductDAO;
import videoSite.Model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TOUHID on 9/10/2016.
 */
@Repository
@Transactional
public class ProductDAOimpliment implements ProductDAO {

  @Autowired
  private SessionFactory sessionFactory;


  public List<Product> getProductList() {
    Session session = sessionFactory.getCurrentSession();
    Query query = session.createQuery("FROM Product");
    List<Product> productList = query.list();
    session.flush();

    return productList;
  }

  public Product getProductById(long id) {
    Session session = sessionFactory.getCurrentSession();
    Product product = (Product) session.get(Product.class, id);
    session.flush();

    return product;
  }

  public void addProduct(Product product) {
    Session session = sessionFactory.getCurrentSession();
    session.saveOrUpdate(product);
    session.flush();
  }

  public void editProduct(Product product) {
    Session session = sessionFactory.getCurrentSession();
    session.saveOrUpdate(product);
    session.flush();
  }

  public void deleteProduct(Product product) {
    Session session = sessionFactory.getCurrentSession();
    session.delete(product);
    session.flush();
  }
}
