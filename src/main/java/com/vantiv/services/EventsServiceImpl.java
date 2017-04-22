package com.vantiv.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vantiv.model.Event;
import com.vantiv.repositories.EventRepository;

@Service
public class EventsServiceImpl implements EventsService {
	@Autowired
	private EventRepository eventRepository;
	public List<Event> findAll() {
		List<Event> events = new ArrayList<Event> ();
		Event event = new Event();
		event.setEventName("First Event");
		event.setFaceValue(new BigDecimal("20.00"));
		events.add(event);

		Event event2 = new Event();
		event2.setEventName("Second Event");
		event2.setFaceValue(new BigDecimal("100.00"));
		events.add(event2);

		Event event3 = new Event();
		event3.setEventName("Third Event");
		event3.setFaceValue(new BigDecimal("13.37"));
		events.add(event3);

		Event event4 = new Event();
		event4.setEventName("Fourth Event");
		event4.setFaceValue(new BigDecimal("49.95"));
		events.add(event4);

		Event event5 = new Event();
		event5.setEventName("Fifth Event");
		event5.setFaceValue(new BigDecimal("1000.00"));
		events.add(event5);
		
		return events;
	};
	
}
