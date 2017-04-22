package com.vantiv.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrganizationsController {

	@RequestMapping("/organizations")
	public String team(Map<String, Object> model) {
		return "organizations";
	}
}
