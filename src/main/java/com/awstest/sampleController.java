package com.awstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @RequestMapping("/sample")
    public String sample() {
        return "sample";
    }


}
