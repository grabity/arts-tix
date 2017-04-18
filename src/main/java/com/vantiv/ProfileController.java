package com.vantiv;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String profile(Map<String, Object> model) {
    	model.put("username", "Rich Hill");
        return "profile";
    }

}
