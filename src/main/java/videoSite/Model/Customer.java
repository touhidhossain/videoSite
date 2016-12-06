package videoSite.Model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by root on 10/11/16.
 */
@Entity
public class Customer implements Serializable{

    private static final long serialVersionUID = 9024427243042485819L;

    @Id
    @GeneratedValue
    private long customerId;

    @NotEmpty(message = "The Customer first name must not be null.")
    private String customerFirstName;

    @NotEmpty(message = "The Customer last name must not be null.")
    private String customerLastName;

    @NotEmpty(message = "The Customer email must not be null.")
    private String customerEmail;

    @NotEmpty(message = "The Customer phone no must not be null.")
    private String customerPhone;

    @NotEmpty(message = "Username must not be null.")
    private String username;

    @NotEmpty(message = "Password must not be null.")
    private String password;

    private boolean enable;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
