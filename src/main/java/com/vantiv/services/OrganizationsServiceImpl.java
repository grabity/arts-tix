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
		organization.setId(new Long(555));
		organization.setVenueName("Mam Luft Dance Company");
		organization.setLattitude(new BigDecimal("20.00"));
		organization.setVenueImage("MamLuft.png");
		organizations.add(organization);

		Venue organization2 = new Venue();
		organization.setId(new Long(556));
		organization2.setVenueName("Nrityapana School of Performing Arts");
		organization2.setLattitude(new BigDecimal("100.00"));
		organization2.setVenueImage("NrityapanaSchoolofPerformingArts.png");
		organizations.add(organization2);

		Venue organization3 = new Venue();
		organization.setId(new Long(557));
		organization3.setVenueName("Cincinnati Music Academy");
		organization3.setLattitude(new BigDecimal("13.37"));
		organization3.setVenueImage("EnsembleTheatre.png");
		organizations.add(organization3);

		Venue organization4 = new Venue();
		organization.setId(new Long(558));
		organization4.setVenueName("Ensemble Theatre");
		organization4.setLattitude(new BigDecimal("49.95"));
		organization4.setVenueImage("CincinnatiMusicAcademy.png");
		organizations.add(organization4);

		Venue organization5 = new Venue();
		organization.setId(new Long(559));
		organization5.setVenueName("Aronoff Center for the Arts");
		organization5.setLattitude(new BigDecimal("1000.00"));
		organization5.setVenueImage("AronoffCenter.png");
		organizations.add(organization5);
		
		return organizations;
	};
	
}
