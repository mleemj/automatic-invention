package io.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/list_emps.html")
    public String showEmployee(ModelMap model) {
        model.addAttribute("firstName", "James");
        model.addAttribute("title", "EMPLOYEE");
        return "list-employees";
    }
}
