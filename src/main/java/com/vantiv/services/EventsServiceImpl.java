package com.vantiv.services;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		event.setId(1L);
		event.setEventName("The Kaplan New Works");
		event.setFaceValue(new BigDecimal("70.00"));
		event.setEventImage("New_Works_1300X740-8cb90fcea3.jpg");
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.APRIL, 22, 19, 0);
		event.setEventDate(cal.getTime());
		events.add(event);

		Event event2 = new Event();
		event2.setId(2L);
		event2.setEventName("Louis Conducts Mahler");
		event2.setFaceValue(new BigDecimal("84.00"));
		event2.setEventImage("louisconductsmahler2550x482-opt.jpg");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2017, Calendar.APRIL, 22, 19, 0);
		event2.setEventDate(cal2.getTime());
		events.add(event2);

		Event event3 = new Event();
		event3.setId(3L);
		event3.setEventName("Disney In Concert");
		event3.setFaceValue(new BigDecimal("99.00"));
		event3.setEventImage("disney2550x482-opt-fa9f712563.jpg");
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2017, Calendar.APRIL, 28, 16, 30);
		event3.setEventDate(cal3.getTime());
		events.add(event3);

		Event event4 = new Event();
		event4.setId(4L);
		event4.setEventName("Beautiful, The Carol King Musical");
		event4.setFaceValue(new BigDecimal("34.00"));
		event4.setEventImage("Beautiful-1300x740-5583f65ddb.jpg");
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2017, Calendar.MAY, 2, 17, 30);
		event4.setEventDate(cal4.getTime());
		events.add(event4);

		Event event5 = new Event();
		event5.setId(5L);
		event5.setEventName("Violin Legends: Midori");
		event5.setFaceValue(new BigDecimal("23.00"));
		event5.setEventImage("midori650-a46ca393ef.jpg");
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2017, Calendar.MAY, 4, 19, 30);
		event5.setEventDate(cal5.getTime());
		events.add(event5);
		
		events.addAll(eventRepository.findAll());
		
		return events;
	};
	
	public Event findById(Long eventId) {
		Event event = new Event();
		event.setId(1L);
		event.setEventName("The Kaplan New Works");
		event.setFaceValue(new BigDecimal("70.00"));
		event.setEventImage("New_Works_1300X740-8cb90fcea3.jpg");
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.APRIL, 22, 19, 0);
		event.setEventDate(cal.getTime());
		return event;

//		return eventRepository.findById(eventId);
	}
}
