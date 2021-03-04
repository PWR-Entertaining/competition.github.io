package by.vtb.Competitions.boots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import by.vtb.Competitions.StaticData;
import by.vtb.Competitions.boots.entity.User;
import by.vtb.Competitions.boots.service.UserService;

@Controller
public class RegistrationController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/registration_first")
    public String registrationFirst(Model model) {
        System.out.println("registrationFirst");
        model.addAttribute("userForm",new User());
        model.addAttribute("style","none");
        return "/registration_first";
    }
    
    @GetMapping("/registration_second")
    public String registrationSecondGet(@ModelAttribute("userForm") User userForm,Model model) {
        return "registration_second";
    }
    
    @PostMapping("/registration_second")
    public String registrationSecondPost(@ModelAttribute("userForm") User userForm,Model model) {
        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())){
            
            model.addAttribute("error","Пароли не совпадают");
            return "/registration_first";
        }
        
        if (userService.loadUserByUsername(userForm.getUsername()) != null) {
            model.addAttribute("error","Пользователь с таким email существует");
            return "/registration_first";
        }
        model.addAttribute("userForm",userForm);  
        return "registration_second";

    }
    
    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm) {
        userForm.setPassword(StaticData.USER.getPassword());
        userForm.setUsername(StaticData.USER.getUsername());
        
        StaticData.USER=new User();
        
        userService.saveUser(userForm);
        
        return "redirect:/";
    }

}
