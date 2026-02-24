package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo1Controller {
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
