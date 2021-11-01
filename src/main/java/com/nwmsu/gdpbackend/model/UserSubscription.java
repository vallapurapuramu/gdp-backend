package com.nwmsu.gdpbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usersubscription")
public class UserSubscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
 private int userCompanyId;
public UserSubscription() {
	
}
public UserSubscription(int userCompanyId) {
	super();
	this.userCompanyId = userCompanyId;
}

public int getUserCompanyId() {
	return userCompanyId;
}

public void setUserCompanyId(int userCompanyId) {
	this.userCompanyId = userCompanyId;
}
 
}
