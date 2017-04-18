package com.vantiv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @RequestMapping("/second")
    public String index() {
        return "Greetings from the second controller!";
    }

}
