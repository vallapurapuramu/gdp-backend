package com.nwmsu.gdpbackend.service;

import java.util.List;

import com.nwmsu.gdpbackend.model.Event;
import com.sun.istack.NotNull;

public interface EventService {

	List<Event> getAllEvents();

	void addNewEvent(@NotNull Event event);

	Event getEventById(long id);

	void deleteEventById(long id);

}
