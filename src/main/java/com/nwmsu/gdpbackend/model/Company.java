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

	public Company() {

	}

	public Company(int id, String company_Name, String address, int telephone_Number) {
		super();
		this.id = id;
		Company_Name = company_Name;
		Address = address;
		Telephone_Number = telephone_Number;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int id;

	@Column(name = "company_name")
	private String Company_Name;

	@Column(name = "address")
	private String Address;

	@Column(name = "mobileno")
	private int Telephone_Number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getTelephone_Number() {
		return Telephone_Number;
	}

	public void setTelephone_Number(int telephone_Number) {
		Telephone_Number = telephone_Number;
	}

}
