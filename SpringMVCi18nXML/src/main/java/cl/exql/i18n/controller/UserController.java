package cl.exql.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping({"/","/add"})
    public String userForm() {
        return "userForm";
    }
}
