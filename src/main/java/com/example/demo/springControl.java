package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springControl {

    @RequestMapping
    public String helloworld(){

        return "hello world spring boot";
    }

@RequestMapping("/goodbye")
    public String goodbaye(){

        return "good bye Spring boot ";

}





}
