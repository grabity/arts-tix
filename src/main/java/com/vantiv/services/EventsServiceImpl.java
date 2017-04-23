package com.vantiv.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vantiv.model.Event;
import com.vantiv.repositories.EventRepository;

@Service
public class EventsServiceImpl implements EventsService {
	
	private static Map<Long,Event> eventMap = new HashMap<Long,Event>();
	{
		Event event = new Event();
		event.setId(1L);
		event.setEventName("The Kaplan New Works");
		event.setFaceValue(new BigDecimal("70.00"));
		event.setEventImage("New_Works_1300X740-8cb90fcea3.jpg");
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.APRIL, 23, 19, 0);
		event.setEventDate(cal.getTime());
		event.setTicketsRemaining(6);
		event.setDescription("No season of celebration would ever be complete without The Kaplan New Works Series, now a Cincinnati institution. New Works remains committed to celebrating innovation in dance and brings internationally recognized choreographers right to our door step. This year is no exception with a dazzling, all-women roster. Victoria has chosen the best female choreographers to present their work alongside her, in keeping with the tradition of innovation while highlighting the talented women who are underrepresented in our art form. Morgan will present a world premiere of her own along with new works from Jennifer Archibald, Annabelle Lopez Ochoa and Heather Britt.");
		eventMap.put(event.getId(), event);

		Event event2 = new Event();
		event2.setId(2L);
		event2.setEventName("Louis Conducts Mahler");
		event2.setFaceValue(new BigDecimal("84.00"));
		event2.setEventImage("louisconductsmahler2550x482-opt.jpg");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2017, Calendar.APRIL, 22, 19, 0);
		event2.setEventDate(cal2.getTime());
		event2.setTicketsRemaining(7);
		event2.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		eventMap.put(event2.getId(), event2);

		Event event3 = new Event();
		event3.setId(3L);
		event3.setEventName("Disney In Concert");
		event3.setFaceValue(new BigDecimal("99.00"));
		event3.setEventImage("disney2550x482-opt-fa9f712563.jpg");
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2017, Calendar.APRIL, 28, 20, 00);
		event3.setEventDate(cal3.getTime());
		event3.setTicketsRemaining(0);
		event3.setDescription("We are thrilled to introduce Disney in Concert: Tale as Old as Time, a musical celebration exploring the magical moments and feats of heroics from Frozen, The Little Mermaid, Lion King, Beauty and the Beast, Aladdin and more. performances include a quartet of brilliant young singers and high-resolution film clips above the orchestra. Experience this new chapter of Disney magic!");
		eventMap.put(event3.getId(), event3);

		Event event4 = new Event();
		event4.setId(4L);
		event4.setEventName("Beautiful, The Carol King Musical");
		event4.setFaceValue(new BigDecimal("34.00"));
		event4.setEventImage("Beautiful-1300x740-5583f65ddb.jpg");
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2017, Calendar.MAY, 2, 17, 30);
		event4.setEventDate(cal4.getTime());
		event4.setTicketsRemaining(9);
		event4.setDescription("Long before she was Carole King, chart-topping music legend, she was Carol Klein, Brooklyn girl with passion and chutzpah. She fought her way into the record business as a teenager and, by the time she reached her twenties, had the husband of her dreams and a flourishing career writing hits for the biggest acts in rock ‘n’ roll. But it wasn’t until her personal life began to crack that she finally managed to find her true voice. Beautiful: The Carole King Musical tells the inspiring true story of King’s remarkable rise to stardom, from being part of a hit songwriting team with her husband Gerry Goffin, to her relationship with fellow writers and best friends Cynthia Weil and Barry Mann, to becoming one of the most successful solo acts in popular music history. Along the way, she made more than beautiful music, she wrote the soundtrack to a generation.");
		eventMap.put(event4.getId(), event4);

		Event event5 = new Event();
		event5.setId(5L);
		event5.setEventName("Violin Legends: Midori");
		event5.setFaceValue(new BigDecimal("23.00"));
		event5.setEventImage("midori650-a46ca393ef.jpg");
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2017, Calendar.MAY, 4, 19, 30);
		event5.setEventDate(cal5.getTime());
		event5.setTicketsRemaining(12);
		event5.setDescription("The renowned violinist Midori, a favorite of Cincinnati audiences since her first appearances here when she was still in her teens, will perform Britten’s masterful and technically dazzling Violin Concerto. Strauss’ dynamicAlso Sprach Zarathustra, whose opening flourish is among the most recognizable ever in classical music (think 2001: A Space Odyssey) brings the program to an exhilarating conclusion.");
		eventMap.put(event5.getId(), event5);		
	}
	
	@Autowired
	private EventRepository eventRepository;
	public List<Event> findAll() {
		List<Event> events = new ArrayList<Event> ();
		events.addAll(eventMap.values());
		
		events.addAll(eventRepository.findAll());
		
		Collections.sort(events);
		
		return events;
	};
	
	public Event findById(Long eventId) {
		return eventMap.get(eventId);

//		return eventRepository.findById(eventId);
	}
}
