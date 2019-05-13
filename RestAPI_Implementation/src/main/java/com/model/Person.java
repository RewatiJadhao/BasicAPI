package com.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	
	private int personNumber;
	private String name;
	private int age;
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
