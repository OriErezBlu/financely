package com.financely.reports;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {


    @Value("${application.name.main}")
    private String applicationNameMain;

    @Value("${application.name}")
    private String applicationName;

    @Value("${test}")
    private String test;

//    @Value("${testReports}")
//    private String testReports;

    @GetMapping("test")
    public String test() {
        return applicationName + test +  applicationNameMain;
    }
}
