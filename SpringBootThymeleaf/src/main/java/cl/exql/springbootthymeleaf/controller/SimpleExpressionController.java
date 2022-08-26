package cl.exql.springbootthymeleaf.controller;

import cl.exql.springbootthymeleaf.model.Address;
import cl.exql.springbootthymeleaf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleExpressionController {

    @GetMapping("/simpleExpression")
    public String simpleExpression(Model model) {
        Address address = new Address("123 Street", "4567");
        Person person = new Person(1L, "Emil", address);
        model.addAttribute("person1", person);
        return "simpleExpression";
    }
}
