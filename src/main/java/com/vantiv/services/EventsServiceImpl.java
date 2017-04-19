package com.vantiv.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vantiv.model.Event;

@Service
public class EventsServiceImpl implements EventsService {
	public List<Event> findAll() {
		List<Event> events = new ArrayList<Event> ();
		Event event = new Event();
		event.setEventName("First Event");
		event.setFaceValue("$20.00");
		events.add(event);

		Event event2 = new Event();
		event2.setEventName("Second Event");
		event2.setFaceValue("$100.00");
		events.add(event2);

		Event event3 = new Event();
		event3.setEventName("Third Event");
		event3.setFaceValue("$13.37");
		events.add(event3);

		Event event4 = new Event();
		event4.setEventName("Fourth Event");
		event4.setFaceValue("$49.95");
		events.add(event4);

		Event event5 = new Event();
		event5.setEventName("Fifth Event");
		event5.setFaceValue("$1,000.00");
		events.add(event5);

		return events;
	};
	
}
