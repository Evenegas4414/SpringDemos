package cl.exql.smvc1.controller;

import cl.exql.smvc1.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @GetMapping("/orderForm")
    public String orderForm(@ModelAttribute(name = "order") Order order) {
        return "orderForm";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(Order order) {
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success() {
        return "thankyou";
    }

}
