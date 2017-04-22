package com.vantiv.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.vantiv.model.Event;

public interface EventRepository extends Repository<Event, Long> {

	public List<Event> findAll();
	public Event findById(Long id);
}
