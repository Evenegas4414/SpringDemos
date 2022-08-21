package cl.exql.smvc1.controller;

import cl.exql.smvc1.model.Country;
import cl.exql.smvc1.model.Customer;
import cl.exql.smvc1.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String getCustomerForm(@ModelAttribute("customer") Customer customer, Model model) {
        List<Country> countries = Arrays.asList(
                new Country("1", "Chile"),
                new Country("2", "Brasil"),
                new Country("3", "Argentina"));
        model.addAttribute("countries", countries);
        System.out.println(countries);
        return "customerForm";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        System.out.println(customer);
        return "customerDetail";
    }

    @GetMapping("/editCustomer")
    public String editCustomer(Model model) {
        Phone phone = new Phone("987","654","321");
        Country country = new Country("1", "Chile");
        Customer customer = new Customer("Test", "Customer", phone, country);
        model.addAttribute("customer", customer);
        List<String> countries = Arrays.asList("Chile", "Brasil", "Argentina");
        model.addAttribute("countries", countries);
        System.out.println(customer);
        return "editCustomer";
    }
}
