package com.financely.apigateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("test")
    public String test() {
        return applicationName;
    }
}
