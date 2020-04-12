package com.luv2code.springdemo.mvc.controllers;

import com.luv2code.springdemo.mvc.objects.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "showCustomerForm";
    }

    @RequestMapping("processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {

        boolean hasResults = bindingResult.hasErrors();
        String responseDto = bindingResult.toString();

        System.out.println("Has Results: " + hasResults +"  and response DTO: " + responseDto);

        if (bindingResult.hasErrors()) {
            return "showCustomerForm";
        } else {
            return "customerProcessForm";
        }
    }
}