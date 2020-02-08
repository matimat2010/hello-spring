package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

  @RequestMapping(value= "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String thegreeting = "Hello, "+ name + "!";
        model.addAttribute("greeting", thegreeting);
        return "hello";
    }

    // Handles request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")

    public String helloWithPathParam(@PathVariable String name, Model model){
        String thegreeting = "Hello, "+ name + "!";
        model.addAttribute("greeting", thegreeting);
      return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "form";

    }
    @GetMapping("hello-names")
    public String helloNames(Model model){
    List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Paul");
        names.add("Ringo");
        model.addAttribute("names",names);
      return "hello-list";
    }

}
