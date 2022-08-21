package cl.exql.smvc1.model;

public class Customer {

    private String firstName;
    private String lastName;
    private Phone phone;
    private Country country;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Phone phone, Country country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.country = country;
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", country=" + country +
                '}';
    }
}
