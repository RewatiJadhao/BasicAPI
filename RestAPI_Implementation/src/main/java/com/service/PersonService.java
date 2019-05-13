package com.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.model.Person;

@Service
public class PersonService {

	HashMap<Integer,Person> persons=new HashMap<>();
	
	public PersonService()
	{
		
		Person p=new Person();
		p.setPersonNumber(1);
		p.setName("Rewa");
		p.setAge(20);
		
		Person p1=new Person();
		p1.setPersonNumber(2);
		p1.setName("Sana");
		p1.setAge(25);
		
		persons.put(10, p);
		persons.put(20, p1);
		
		
	}
	
	public Person getPerson(int pNumber) {
		
		if(persons.containsKey(pNumber))
		{
			return persons.get(pNumber);
		}
		else {
			return null;
		}
	}
	
	public HashMap<Integer, Person> getAllPerson() {
		
		return persons;
	}
}
