package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by genebrowder on 2/14/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello Spring Boot";
    }
}
