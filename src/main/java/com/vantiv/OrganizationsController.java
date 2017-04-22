package com.vantiv;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vantiv.model.Venue;
import com.vantiv.services.OrganizationsService;

@Controller
public class OrganizationsController {
	
	@Autowired
	private OrganizationsService organizationsService;

	@RequestMapping("/organizations")
	public String team(Map<String, Object> model) {
		List<Venue> organizations = organizationsService.findAll();
    	model.put("organizations", organizations);
		return "organizations";
	}
}

