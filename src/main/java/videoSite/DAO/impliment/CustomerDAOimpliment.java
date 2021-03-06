package videoSite.DAO.impliment;

import videoSite.DAO.CustomerDAO;
import videoSite.Model.Authorities;
import videoSite.Model.Customer;
import videoSite.Model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 10/20/16.
 */
@Repository
@Transactional
public class CustomerDAOimpliment implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public List<Customer> getCustomerList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Customer");
        List<Customer> customerList = query.list();
        session.flush();
        return customerList;
    }

    public Customer getCustomerById(long id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.get(Customer.class, id);
        session.flush();
        return customer;
    }

    public Customer getCustomerByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Customer WHERE username= '"+username+"' ");
        return (Customer) query.uniqueResult();
    }

    /*@Override
    public Customer getCustomerByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.get(Customer.class, username);
        session.flush();
        return customer;
    }*/

    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();


        session.saveOrUpdate(customer);

        Users newUser = new Users();
        newUser.setCustomerId(customer.getCustomerId());
        newUser.setUsername(customer.getUserName());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);

        Authorities authority = new Authorities();
        authority.setUsername(customer.getUserName());
        authority.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(authority);

        session.saveOrUpdate(customer);

        session.flush();
    }

    public void editCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(customer);

        Users newUser = new Users();
        newUser.setCustomerId(customer.getCustomerId());
        newUser.setUsername(customer.getUserName());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);

        Authorities authority = new Authorities();
        authority.setUsername(customer.getUserName());
        authority.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(authority);

        session.saveOrUpdate(customer);

        session.flush();
    }

    public void deleteCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(customer);
        session.flush();
    }
}
