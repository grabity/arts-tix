package com.vantiv.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamController {

	@RequestMapping("/team")
	public String team(Map<String, Object> model) {
		return "team";
	}
}
