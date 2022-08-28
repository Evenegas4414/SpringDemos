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

        Address address1 = new Address("123 Street", "4567");
        Person person1 = new Person(1L, "Mercedes", address1);
        model.addAttribute("person1", person1);

        Address address2 = new Address("321 True Street", "7654");
        Person person2 = new Person(2L, "Ingrid", address2);
        model.addAttribute("person2", person2);
        return "simpleExpression";
    }
}
