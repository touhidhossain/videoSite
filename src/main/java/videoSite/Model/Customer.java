package videoSite.Model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
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
    private String firstName;

    @NotEmpty(message = "The Customer last name must not be null.")
    private String lastName;

    @NotEmpty(message = "The Customer email must not be null.")
    @Email(message = "Input corrcet email id.")
    private String email;

    @NotEmpty(message = "The Customer phone no must not be null.")
    private String contact;

    @NotEmpty(message = "Username must not be null.")
    private String userName;

    @NotEmpty(message = "Password must not be null.")
    private String password;

    private String bloodGroup;

    @NotEmpty(message = "Street not be null.")
    private String street;

    @NotEmpty(message = "Area not be null.")
    private String area;

    @Min(value = 1,message = "Input postal code.")
    private int postalCode;

    @NotEmpty(message = "City not be null.")
    private String city;

    @NotEmpty(message = "District not be null.")
    private String district;

    @NotEmpty(message = "Country not be null.")
    private String country;

    private boolean enable;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", country='" + country + '\'' +
                ", enable=" + enable +
                '}';
    }
}
