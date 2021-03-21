package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/about-us")
    public String aboutUs() {
        return "about-us";
    }

    @RequestMapping("/contact-us")
    public String contactUs() {
        return "contact-us";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
