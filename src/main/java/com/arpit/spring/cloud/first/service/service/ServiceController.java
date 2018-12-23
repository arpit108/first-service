package com.arpit.spring.cloud.first.service.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {

    @GetMapping
    public String getName(@RequestHeader("x-location") String location)
    {
        return "My First Service from "+location +" !!!";
    }


}
