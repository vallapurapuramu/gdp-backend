package com.nwmsu.gdpbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;



@Entity
@Table(name = "COMPANY")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Company_Id;

	@Column
	private String Company_Name;

	@Column
	private String Address;

	@NaturalId
	@Column
	private int Telephone_Number;

	@Column
	private String createdAt;
     
	@Column
	private String updatedAt;

}
