package com.nwmsu.gdpbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_application")
public class NewApplication {

	public NewApplication() {

	}

	public NewApplication(int id, String applicationdetails) {
		super();
		this.id = id;
		this.applicationdetails = applicationdetails;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "application_id")
	private int id;

	@Column(name = "application_details")
	private String applicationdetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicationdetails() {
		return applicationdetails;
	}

	public void setApplicationdetails(String applicationdetails) {
		this.applicationdetails = applicationdetails;
	}

}
