package cl.exql.springbootdatabinding.controller;

import cl.exql.springbootdatabinding.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeeController {

    @GetMapping({"/", "/add"})
    public String getEmployeeForm(@ModelAttribute("employee") Employee employee) {
        System.out.println("GM: /add -> " + employee);
        return "employeeForm";
    }

    @PostMapping({"/add"})
    public String sendEmployeeForm(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        //DB -> save
        redirectAttributes.addFlashAttribute("employee", employee);
        System.out.println("PM: /add -> " + employee);
        return "redirect:/detail";
    }

    @GetMapping({"/detail"})
    public String getDetail() {
        return "detail";
    }
}
