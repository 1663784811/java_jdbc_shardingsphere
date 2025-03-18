package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private MyService myService;

    @GetMapping("")
    public String index(){
        myService.find();
        return "index";
    }

    @GetMapping("write")
    public String write(){
        myService.saveUserAndOrder();
        return "write";
    }

}
