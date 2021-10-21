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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String EventName;
	@Column
	private String EventDescription;
	@Column
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
