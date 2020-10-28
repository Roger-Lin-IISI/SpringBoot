package com.example.springbootdemo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.IOUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) throws IOException {
        System.out.println(new String(IOUtils.readAllBytes(request.getInputStream())));
        return  "Hi";
    }
}
