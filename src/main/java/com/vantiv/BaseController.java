package com.vantiv;


import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.realm.GenericPrincipal;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public BaseController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping
    public String helloFacebook(HttpServletRequest request, Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        String [] fields = { "id", "email",  "name" };
        User userProfile = facebook.fetchObject("me", User.class, fields);
        
        HttpSession session = request.getSession(true);
        final String credentials = "credentials";
        final List<String> roles = new ArrayList<String>();
        final Principal principal = new GenericPrincipal(userProfile.getName(), credentials, roles);
        session.setAttribute("user", principal);
        model.addAttribute("userName", userProfile.getName());
        model.addAttribute("userId", userProfile.getId());
        return "index";
    }
    
 }