package com.vantiv.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vantiv.model.Purchase;
import com.vantiv.services.EventsService;

@Controller
public class CompletePurchaseController {

	@Autowired
	EventsService eventsService;

	@PostMapping(value="/completePurchase")
	public String completePurchase(HttpServletRequest request, @ModelAttribute Purchase purchase) {
		System.out.println("Getting form variables");
		Long eventId = Long.valueOf(purchase.getEventId());
		request.setAttribute("event", eventsService.findById(eventId));
		return "completePurchase";
	}
}
