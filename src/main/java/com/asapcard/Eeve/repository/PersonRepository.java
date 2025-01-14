package com.asapcard.Eeve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asapcard.Eeve.model.JsonTransaction;
import com.asapcard.Eeve.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	void save(JsonTransaction jsonToStrigPerson);

}
