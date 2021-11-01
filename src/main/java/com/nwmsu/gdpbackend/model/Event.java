package com.nwmsu.gdpbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

	public Event() {

	}

	public Event(long id, String eventName, String eventDescription, String eventType) {
		super();
		this.id = id;
		this.EventName = eventName;
		this.EventDescription = eventDescription;
		this.EventType = eventType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private long id;
	@Column(name = "eventname")
	private String EventName;
	@Column(name = "eventdescription")
	private String EventDescription;
	@Column(name = "eventtype")
	private String EventType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public String getEventDescription() {
		return EventDescription;
	}

	public void setEventDescription(String eventDescription) {
		EventDescription = eventDescription;
	}

	public String getEventType() {
		return EventType;
	}

	public void setEventType(String eventType) {
		EventType = eventType;
	}

}
