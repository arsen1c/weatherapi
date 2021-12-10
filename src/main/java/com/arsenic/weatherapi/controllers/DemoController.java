package com.arsenic.weatherapi.controllers;

import com.arsenic.weatherapi.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/demo")
    public Demo demo() {
        return new Demo();
    }

}
