package videoSite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import videoSite.Model.Customer;
import videoSite.Service.CustomerService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by root on 10/19/16.
 */
@Controller
public class RegisterController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value ="/register", method = RequestMethod.GET)
    public String registerCustomer(Model model){
        Customer customer = new Customer();

        model.addAttribute("customer", customer);

        return "registerCustomer";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCudtomerPosr(@Valid @ModelAttribute("customer") Customer customer,
                                       BindingResult result, HttpServletRequest request, Model model){
        if(result.hasErrors()){
            return "registerCustomer";
        }

        List<Customer> customerList = customerService.getCustomerList();

        for(int i =0; i<customerList.size(); i++){
            if(customer.getEmail().equals(customerList.get(i).getEmail())){
                model.addAttribute("emailMsg", "Email already exist.");
                return "registerCustomer";
            }

            if(customer.getUserName().equals(customerList.get(i).getUserName())){
                model.addAttribute("usernameMsg", "Username already exist.");
                return "registerCustomer";
            }
        }

        customer.setEnable(true);
        customerService.addCustomer(customer);

        return "registrationSuccess";
    }
}
