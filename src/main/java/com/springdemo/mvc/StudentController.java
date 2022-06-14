package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        //create student object
        Student theStudent = new Student();

        //addstudent object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    //TODO: @ModelAttribute("student") String theName automatically gets the student object from Model param and assigns to theName argument
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student, Model model) {

        String result = student.getName() + " " + student.getLastName() + " " + student.getCountry();

        System.out.println(result);

        //add message to Model
        //model.addAttribute("message", result);

        return "student-confirmation";
    }
}
