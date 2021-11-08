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
	public Event(long id, String eventname, String eventdescription, String eventtype, Company company,
			List<User> users_id) {
		super();
		this.id = id;
		this.eventname = eventname;
		this.eventdescription = eventdescription;
		this.eventtype = eventtype;
		this.company = company;
		this.users_id = users_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private long id;
	@Column(name = "event_name")
	private String eventname;
	@Column(name = "event_description")
	private String eventdescription;
	@Column(name = "event_type")
	private String eventtype;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JsonBackReference
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;

	@ManyToMany(mappedBy = "enrolled_events", cascade = { CascadeType.ALL })
	List<User> users_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEventdescription() {
		return eventdescription;
	}

	public void setEventdescription(String eventdescription) {
		this.eventdescription = eventdescription;
	}

	public String getEventtype() {
		return eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
}
