package com.vantiv;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vantiv.model.Event;
import com.vantiv.services.EventsService;

@Controller
public class EventsController {

	@Autowired
	private EventsService eventsService;
	
    @RequestMapping("/events")
    public String profile(Map<String, Object> model) {
    	List<Event> events = eventsService.findAll();
    	model.put("events", events);
        return "events";
    }
}
