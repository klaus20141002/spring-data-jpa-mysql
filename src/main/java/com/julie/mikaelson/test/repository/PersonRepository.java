package com.julie.mikaelson.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.julie.mikaelson.test.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	List<Person> findByLastname(String lastname);
}
