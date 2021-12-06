package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaowen3
 */
@RestController
@RequestMapping("function")
public class TestController {

    @GetMapping("/test")
    public Object testProgram(){
        return "success";
    }

}
