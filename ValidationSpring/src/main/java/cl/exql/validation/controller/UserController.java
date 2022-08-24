package cl.exql.validation.controller;

import cl.exql.validation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String getUserForm(@ModelAttribute("user") User user, Model model) {
        Map<String, String> roles = new HashMap<String, String>();
        roles.put("admin", "ADMIN");
        roles.put("dba", "DBA");
        model.addAttribute("roles", roles);
        return "userForm";
    }

    @PostMapping("/add")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
                           RedirectAttributes redirectAttributes, Model model) {
        System.out.println("Errors: " + bindingResult.hasErrors());
        if (bindingResult.hasErrors()) {
            Map<String, String> roles = new HashMap<String, String>();
            roles.put("admin", "ADMIN");
            roles.put("dba", "DBA");
            model.addAttribute("roles", roles);
            return "userForm";
        }

        System.out.println("Saving to DB... " + user.toString());
        redirectAttributes.addFlashAttribute(user);
        return "redirect:/user/userDetails";
    }

    @GetMapping("/userDetails")
    public String success() {
        return "success";
    }


}
