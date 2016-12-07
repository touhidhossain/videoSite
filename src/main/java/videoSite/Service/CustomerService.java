package videoSite.Service;

import videoSite.Model.Customer;

import java.util.List;

/**
 * Created by root on 12/7/16.
 */
public interface CustomerService {
    List<Customer> getCustomerList();
    Customer getCustomerById(long id);
    Customer getCustomerByUsername(String username);
    void addCustomer(Customer customer);
    void editCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
