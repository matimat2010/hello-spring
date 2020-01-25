package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    // Handles request at path /hello
    //@GetMapping("hello")

    public String hello() {
        return "Hello, Spring!";
    }

    //live  /hello/goodbye
    @GetMapping("goodbye")

    public String goodBye() {
        return "Good Bye, Spring!";
    }
    //live /hello/hello
    // Handles request of form /hello?name=LaunchCode
  @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")

    public String helloWithQueryParam(@RequestParam String name) { return "Hello, " + name + "!";}

    // Handles request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")

    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }


    //live /hello/form
    @GetMapping("form")

    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>"  + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value ='Greet me!'>" +
                "<select language ='language'>" +
                "<option>Spanish</option>" +
                "<option>French</option>" +
                "<option>German</option>" +
                "<option>Martian</option>" +
                "<option>Ruassian</option>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";

    }
}
