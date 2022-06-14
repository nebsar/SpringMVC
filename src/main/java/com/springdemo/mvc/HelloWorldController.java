package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        //read the request parameter from HTML form

        String theName = request.getParameter("studentName");

        //convert data
        theName = theName.toUpperCase();

        //create message
        String result = "Hey! " + theName;

        //add message to Model
        model.addAttribute("message", result);

        return "helloworld";
    }


    //TODO: @RequestParam("studentName") String theName automatically get the studentName param and assigns to theName argument
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        //convert data
        theName = theName.toUpperCase();

        //create message
        String result = "Hey Yo! " + theName;

        //add message to Model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
