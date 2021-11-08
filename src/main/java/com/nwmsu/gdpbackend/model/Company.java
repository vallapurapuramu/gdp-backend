package com.nwmsu.gdpbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	public Company(int company_id, String companyname, String address, long mobilenumber, User user,
			List<Event> events) {
		super();
		this.company_id = company_id;
		this.companyname = companyname;
		this.address = address;
		this.mobilenumber = mobilenumber;
		this.user = user;
		this.events = events;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int company_id;

	@Column(name = "company_name")
	private String companyname;

	@Column(name = "address")
	private String address;

	@Column(name = "mobile_number")
	private long mobilenumber;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "company", cascade = { CascadeType.ALL })
	@JsonManagedReference
	private List<Event> events;

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

}
