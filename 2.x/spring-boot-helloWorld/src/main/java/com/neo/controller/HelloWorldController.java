package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/html")
    public String html() {
        String resp = "<html><a href=\"https://www.runoob.com/\">访问菜鸟教程</a></html>";
        return resp;
    }
}