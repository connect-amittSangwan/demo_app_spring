package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student")
@Controller
public class StudentController {

    @RequestMapping("/showForm")
    public String shorForm(Model theModel) {

        // Create a new Student Object
        Student theStudent = new Student();

        // Add student object to the model
        theModel.addAttribute("student", theStudent); // student name is same which the JSP view page will refer to

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        String studentName = (theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }

}
