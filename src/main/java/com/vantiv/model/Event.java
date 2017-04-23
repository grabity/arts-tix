package com.vantiv.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.util.StringUtils;

@Entity
public class Event implements Comparable {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String eventName;
	@Column
	private BigDecimal faceValue;
	@ManyToOne
	private Venue venue;
	@Column
	private String eventImage;
	@Column
	private Date eventDate;
	@Column
	private String description;
	@Column
	private int ticketsRemaining;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public BigDecimal getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public String getEventImage() {
		return eventImage;
	}
	public void setEventImage(String eventImage) {
		this.eventImage = eventImage;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getTicketsRemaining() {
		return ticketsRemaining;
	}
	public void setTicketsRemaining(int ticketsRemaining) {
		this.ticketsRemaining = ticketsRemaining;
	}
	public String getShortDescription() {
		String output = "";
		if (!StringUtils.isEmpty(this.description)) {
			int characters = Math.min(100, this.description.length());
			output = this.description.substring(0,characters);
			if (description.length() > 100) {
				output += "...";
			}
		}
		return output;
	}
	@Override
	public int compareTo(Object arg0) {
		Event compTo = (Event) arg0;
		return this.getEventDate().compareTo(compTo.getEventDate());
	}
}
