package com.arpit.spring.cloud.first.service.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping
    @RequestMapping("/one1")
    public String getName(@RequestHeader("x-location") String location)
    {
        return "My First Service from "+location +" !!!";
    }


    @GetMapping
    @RequestMapping("/one")
    public String test()
    {
        return "Success !!";
    }

}
