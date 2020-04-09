package com.luv2code.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sillyController")
@Controller
public class SillyController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "silly-form";
    }
}