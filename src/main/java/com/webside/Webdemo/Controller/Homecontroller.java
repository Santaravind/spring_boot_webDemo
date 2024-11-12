package com.webside.Webdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @RequestMapping("/")
    public String greet(){
        return "Saint web ";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, we Educate!!!";
    }
}
