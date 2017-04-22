package com.vantiv.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Venue {

	@Id
	@GeneratedValue
	private Long venueId;
	@Column
	private String venueName;
	@Column
	private BigDecimal lattitude;
	@Column
	private BigDecimal Longitude;

	public Long getVenueId() {
		return venueId;
	}
	public void setVenueId(Long VenueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public BigDecimal getLattitude() {
		return lattitude;
	}
	public void setLattitude(BigDecimal lattitude) {
		this.lattitude = lattitude;
	}
	public BigDecimal getLongitude() {
		return Longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		Longitude = longitude;
	}
	
	
}
