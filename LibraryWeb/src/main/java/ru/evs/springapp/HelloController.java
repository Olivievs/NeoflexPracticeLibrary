package ru.evs.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/init")
    public String sayHello()
    {
        return "init";
    }
}
