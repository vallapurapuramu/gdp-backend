package com.nwmsu.gdpbackend.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class NewApplication {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String eventUserId;

	@Column
	private String Event_Id;

	@Column
	private String User_Id;
	
	

	@Override
	public String toString() {
		return "NewApplication [eventUserId=" + eventUserId + ", Event_Id=" + Event_Id + ", User_Id=" + User_Id + "]";
	}

	public String getEventUserId() {
		return eventUserId;
	}

	public void setEventUserId(String eventUserId) {
		this.eventUserId = eventUserId;
	}

	public String getEvent_Id() {
		return Event_Id;
	}

	public void setEvent_Id(String event_Id) {
		Event_Id = event_Id;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	
	
}
