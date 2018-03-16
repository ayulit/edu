package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by st10902 on 3/16/2018String.
 */
@Controller
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {
        model.addAttribute("username", name);
        return "helloPage";
    }
}
