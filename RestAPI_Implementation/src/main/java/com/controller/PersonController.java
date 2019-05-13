package com.controller;

import java.util.HashMap;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Person;
import com.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	PersonService ps;
	
	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") int pNumber) {
		
		return ps.getPerson(pNumber);
	}
	@RequestMapping("/all")
public HashMap<Integer, Person> getAllPerson() {
		
		return ps.getAllPerson();
	}
	
}
