package com.example.demomaven8;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {
    @GetMapping("/")
    public String test (){
        return "Hello Duong";
    }
}
