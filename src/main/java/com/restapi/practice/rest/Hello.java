package com.restapi.practice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {

    @RequestMapping("/")
    public String s(){
        return "hello from shijna and siva";
    }

}
