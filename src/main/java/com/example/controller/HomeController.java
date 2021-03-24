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

    @RequestMapping("/privacy-policy")
    public String privacyPolicy() {
        return "privacy-policy";
    }

    @RequestMapping("/terms-and-conditions")
    public String termsAndConditions() {
        return "terms-and-conditions";
    }

    @RequestMapping("/delivery-info")
    public String deliveryInfo() {
        return "delivery-info";
    }

    @RequestMapping("/register-farmer")
    public String registerFarmer() {
        return "register-farmer";
    }

    @RequestMapping("/register-customer")
    public String registerCustomer() {
        return "register-customer";
    }
}
