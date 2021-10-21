package com.nwmsu.gdpbackend.serviceimplemnetation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwmsu.gdpbackend.model.Event;
import com.nwmsu.gdpbackend.repository.EventRepository;
import com.nwmsu.gdpbackend.service.EventService;
import com.sun.istack.NotNull;

@Service
@Transactional
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;

	@Override
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}

	@Override
	public void addNewEvent(@NotNull Event event) {
		eventRepository.save(event);

	}

}
