package com.vantiv.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.vantiv.model.Event;

public interface EventRepository extends Repository<Event, Long> {

	public Page<Event> findAll(Pageable pageable);
	public Event findById(Long id);
}
