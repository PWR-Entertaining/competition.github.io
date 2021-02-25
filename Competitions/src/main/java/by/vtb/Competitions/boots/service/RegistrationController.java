package by.vtb.Competitions.boots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import by.vtb.Competitions.boots.entity.User;

@Controller
public class RegistrationController {
    @Autowired
    private UserService user;
    
    @GetMapping("/registration_first")
    public String registrationFirst(Model model) {
        model.addAttribute("userForm",new User());
        return "registration_first";
    }
    
    @GetMapping("/registration_second")
    public String registrationSecond(@ModelAttribute("userForm") User userForm,Model model) {
        model.addAttribute("userForm",userForm);
        System.out.println(userForm.getEmail());
        return "registration_second";
    }
}
