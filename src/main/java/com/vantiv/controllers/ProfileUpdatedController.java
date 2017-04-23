package com.vantiv.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vantiv.model.TixUser;
import com.vantiv.services.TixUserService;

@Controller
public class ProfileUpdatedController {

	@Autowired
	TixUserService tixUserService;

	@PostMapping(value="/profileUpdated")
	public String updateProfile(HttpServletRequest request, @ModelAttribute TixUser profile) {
		System.out.println("Getting form variables");
		Long userId = 111709336056896L;
		request.setAttribute("profile", tixUserService.findById(userId));
		return "profileUpdated";
	}
}
