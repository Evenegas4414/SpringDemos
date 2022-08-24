package cl.exql.validation.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

public class User {

    @Size(min = 2, max = 25)
    //@Size(min = 2, max = 25, message = "Name should be lie between 2 and 25.")
    private String name;
    @NotBlank(message = "Email must have a value.")
    @Email(message = "Email must follow the format: example@mail.com")
    private String email;
    @Min(value = 18, message = "{custom.warning}")
    @NotNull
    //@NotNull(message = "Age is a required field.")
    private Integer age;
    @NotNull(message = "Birthday is a requiered field.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @NotBlank(message = "Role must have a value")
    private String role;
    @Valid
    private Address address;

    public User() {
    }

    public User(String name, String email, Integer age, LocalDate birthday, String role, Address address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
        this.role = role;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", role='" + role + '\'' +
                ", address=" + address +
                '}';
    }
}
