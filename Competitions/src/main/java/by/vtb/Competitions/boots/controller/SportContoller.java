package by.vtb.Competitions.boots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import by.vtb.Competitions.boots.service.SportService;

@Controller
public class SportContoller {
    @Autowired
    private SportService sportService;
    
    @GetMapping("/index")
    public String showIndex() {
        
        return "/";
    } 
    
}
