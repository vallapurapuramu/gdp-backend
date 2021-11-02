package com.nwmsu.gdpbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nwmsu.gdpbackend.model.NewApplication;

@Repository
public interface NewApplicationRepository extends JpaRepository<NewApplication, Integer> {

}
