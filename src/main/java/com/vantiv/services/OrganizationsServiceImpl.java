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
		organization.setVenueURL("http://mamluftcodance.org");
		organizations.add(organization);

		Venue organization2 = new Venue();
		organization2.setId(new Long(557));
		organization2.setVenueName("Ensemble Theatre");
		organization2.setLattitude(new BigDecimal("13.37"));
		organization2.setVenueImage("EnsembleTheatre.png");
		organization2.setVenueURL("https://www.ensemblecincinnati.org");
		organizations.add(organization2);

		Venue organization3 = new Venue();
		organization3.setId(new Long(558));
		organization3.setVenueName("Cincinnati Music Academy");
		organization3.setLattitude(new BigDecimal("49.95"));
		organization3.setVenueImage("CincinnatiMusicAcademy.png");
		organization3.setVenueURL("http://cincinnatimusicacademy.com");
		organizations.add(organization3);

		Venue organization4 = new Venue();
		organization4.setId(new Long(559));
		organization4.setVenueName("Aronoff Center for the Arts");
		organization4.setLattitude(new BigDecimal("1000.00"));
		organization4.setVenueImage("AronoffCenter.png");
		organization4.setVenueURL("http://www.cincinnatiarts.org/aronoff-center");
		organizations.add(organization4);
		
		Venue organization5 = new Venue();
		organization5.setId(new Long(556));
		organization5.setVenueName("Nrityapana School of Performing Arts");
		organization5.setLattitude(new BigDecimal("100.00"));
		organization5.setVenueImage("NrityapanaSchoolofPerformingArts.png");
		organization5.setVenueURL("http://nrityarpana.org/index.html");
		organizations.add(organization5);
		
		return organizations;
	};
	
}
