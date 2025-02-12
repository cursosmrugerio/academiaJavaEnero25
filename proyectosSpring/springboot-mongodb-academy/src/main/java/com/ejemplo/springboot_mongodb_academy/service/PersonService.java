package com.ejemplo.springboot_mongodb_academy.service;

import java.util.List;

import com.ejemplo.springboot_mongodb_academy.collection.Person;

public interface PersonService {
	
	String save(Person person);

	List<Person> findAll();

	void delete(String id);
	
}
