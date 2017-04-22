package com.vantiv.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vantiv.model.Purchase;
import com.vantiv.services.EventsService;

@Controller
public class BeginPurchaseController {

	@Autowired
	EventsService eventsService;
	
	@RequestMapping("/beginPurchase")
	public String makePurchase(HttpServletRequest request, Model model) {
		Long eventId = Long.valueOf(request.getParameter("eventId"));
		System.out.println("get the event id of " + eventId);
		model.addAttribute("event", eventsService.findById(eventId));
		Purchase purchase = new Purchase();
		purchase.setEventId(eventId);
		purchase.setCardId(1337L);
		model.addAttribute("purchase", purchase);
		return "beginPurchase";
	}
}
