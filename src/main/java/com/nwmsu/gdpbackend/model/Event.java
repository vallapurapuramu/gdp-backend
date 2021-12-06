package com.nwmsu.gdpbackend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "events")
public class Event {

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(long id, String eventname, String eventdescription, String eventtype, String location, Date eventdate,
			Company company, List<User> users_id) {
		super();
		this.id = id;
		this.eventname = eventname;
		this.eventdescription = eventdescription;
		this.eventtype = eventtype;
		this.location = location;
		this.eventdate = eventdate;
		this.company = company;
		this.users_id = users_id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getEventdate() {
		return eventdate;
	}

	public void setEventdate(Date eventdate) {
		this.eventdate = eventdate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<User> getUsers_id() {
		return users_id;
	}

	public void setUsers_id(List<User> users_id) {
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
	@Column(name = "location")
	private String location;
	@Column(name = "eventdate")
	private Date eventdate;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JsonBackReference
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;

	@ManyToMany(mappedBy = "enrolled_events", cascade = { CascadeType.PERSIST })
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
