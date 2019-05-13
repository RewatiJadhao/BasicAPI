package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentService {

	ArrayList<Student> studentList=new ArrayList<>();
	
	public StudentService() {
		// TODO Auto-generated constructor stub
		studentList.add(new Student(1,"Rewathi","Java"));
	}
	public Student getStudent(int id)
	{
		return studentList.get(id);
	}
	
	public String createStudent(Student s)
	{
		
		return null;
		
	}
	
	public Student getAllStudent()
	{
		return null;
	}
	
	public String updateStudent()
	{
		return null;
	}
	
	public String deleteStudent()
	{
		return null;
	}
}
