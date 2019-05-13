package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	
	StudentService studentService;
	@RequestMapping("/id")
	public Student getStudentById(@PathVariable int id)
	{
		
		return studentService.getStudent(id);
	}
	
	@RequestMapping()
	public String createStudent()
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
