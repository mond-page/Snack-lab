package mond.springboot.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/my")
    public String my() {
        return "my";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

