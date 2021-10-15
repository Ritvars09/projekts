package com.example.projekts;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class MainController {
    @GetMapping("112")
    public String showHomePage() {
        System.out.println("Main Controler");
        return "index";
    }
}
