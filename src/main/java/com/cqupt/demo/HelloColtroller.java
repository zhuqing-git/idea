package com.cqupt.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloColtroller {

@RequestMapping("/hello")
        public String handle01() {

    System.out.println("Hello,Springboot");
    return "Hello ,Springboot";

        }




}
