package com.vantiv;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vantiv.model.TixUser;
import com.vantiv.services.TixUserService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

	@Autowired
	private TixUserService tixUserService;

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
  
        Long userId = Long.parseLong(userProfile.getId());
        TixUser user = tixUserService.findById(userId);
        model.addAttribute("profile", user);
        return "profile";
    }
    
 }