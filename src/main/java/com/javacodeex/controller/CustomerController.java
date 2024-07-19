package com.javacodeex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController {

    @GetMapping("/public")
    public String getPublicMessage(){
        return "This is from public api";
    }

    @GetMapping("/private")
    public String getPrivateMessage(){
        return "This is from private api";
    }


}
