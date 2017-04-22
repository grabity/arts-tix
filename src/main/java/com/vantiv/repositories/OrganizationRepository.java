package com.vantiv.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.vantiv.model.Venue;

public interface OrganizationRepository extends Repository<Venue, Long> {

	public Page<Venue> findAll(Pageable pageable);
	public Venue findById(Long id);
}