package com.vantiv;


import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public ProfileController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping
    public String helloFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        String [] fields = { "id", "email",  "name" };
        User userProfile = facebook.fetchObject("me", User.class, fields);
                
        model.addAttribute("userName", userProfile.getName());
        model.addAttribute("email", userProfile.getName());
        model.addAttribute("userId", userProfile.getId());
        return "profile";
    }
    
 }