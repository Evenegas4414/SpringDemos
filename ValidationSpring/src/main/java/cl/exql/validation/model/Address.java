package cl.exql.validation.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {

    @NotBlank(message = "Street must have a value.")
    private String street;
    @Size(min=2, max = 15, message = "Size of state must be lie between 2 and 15.")
    private String state;
    @NotNull(message = "Zip Code is a required field.")
    private Integer zipCode;

    public Address() {
    }

    public Address(String street, String state, Integer zipCode) {
        this.street = street;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
