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
	private Long id;
	@Column
	private String venueName;
	@Column
	private BigDecimal lattitude;
	@Column
	private BigDecimal Longitude;
	@Column
	private String venueImage;
	@Column
	private String venueURL;
	

	public String getVenueURL() {
		return venueURL;
	}
	public void setVenueURL(String venueURL) {
		this.venueURL = venueURL;
	}
	public String getVenueImage() {
		return venueImage;
	}
	public void setVenueImage(String venueImage) {
		this.venueImage = venueImage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
