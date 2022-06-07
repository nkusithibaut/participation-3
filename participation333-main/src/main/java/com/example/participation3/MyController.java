package com.example.participation3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/index")
    public String openHome(){
        return "index";
    }
    @GetMapping("/news")
    public String openAboutUs(){
        return "news";
    }
    @GetMapping("/contact")
    public String openContact(){
        return "contact";
    }
    @GetMapping("/about")
    public String openAbout(){
        return "about";
    }
}
