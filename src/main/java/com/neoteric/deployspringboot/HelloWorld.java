package com.neoteric.deployspringboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello World";
    }

}
