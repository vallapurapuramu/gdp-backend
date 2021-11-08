package com.nwmsu.gdpbackend.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nwmsu.gdpbackend.model.Event;
import com.nwmsu.gdpbackend.service.EventService;
import com.sun.istack.NotNull;

@RestController
@CrossOrigin
public class EventController {
	@Autowired
	EventService eventService;

	@PostMapping("/add/event")
	public ResponseEntity<HttpStatus> addNewEvent(@NotNull @RequestBody Event event) {
		try {
			eventService.addNewEvent(event);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/eventslist")
	public ResponseEntity<List<Event>> getAllEvents() {
		List<Event> events = eventService.getAllEvents();
		if (!events.isEmpty()) {
			return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Event>>(events, HttpStatus.NOT_FOUND);
		}

	}
	
	@GetMapping("/event/{id}")
	public ResponseEntity<Event> getEventById(@PathVariable long id) {
		Event event = eventService.getEventById(id);
		if (event != null) {
			return new ResponseEntity<Event>(event, HttpStatus.OK);
		} else {
			return new ResponseEntity<Event>(event, HttpStatus.NOT_FOUND);
		}

	}
}
