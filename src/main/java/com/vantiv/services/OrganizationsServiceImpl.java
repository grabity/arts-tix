package com.vantiv.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vantiv.model.Venue;
import com.vantiv.repositories.OrganizationRepository;

@Service
public class OrganizationsServiceImpl implements OrganizationsService {
	@Autowired
	private OrganizationRepository organizationRepository;
	public List<Venue> findAll() {
		List<Venue> organizations = new ArrayList<Venue> ();
		Venue organization = new Venue();
		organization.setVenueName("First Event");
		organization.setLattitude(new BigDecimal("20.00"));
		organizations.add(organization);

		Venue organization2 = new Venue();
		organization2.setVenueName("Second Event");
		organization2.setLattitude(new BigDecimal("100.00"));
		organizations.add(organization2);

		Venue organization3 = new Venue();
		organization3.setVenueName("Third Event");
		organization3.setLattitude(new BigDecimal("13.37"));
		organizations.add(organization3);

		Venue organization4 = new Venue();
		organization4.setVenueName("Fourth Event");
		organization4.setLattitude(new BigDecimal("49.95"));
		organizations.add(organization4);

		Venue organization5 = new Venue();
		organization5.setVenueName("Fifth Event");
		organization5.setLattitude(new BigDecimal("1000.00"));
		organizations.add(organization5);
		
		return organizations;
	};
	
}
