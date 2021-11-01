package com.nwmsu.gdpbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.debug.Event;

@Repository
public interface NewApplicationRepository extends JpaRepository<Event, Integer> {

}
