package com.model;

public class Student {

	private int studentRollNumber;
	private String studentName;
	private String studentCourse;
	public Student(int id, String name, String course) {
		// TODO Auto-generated constructor stub
		studentRollNumber=id;
		studentName=name;
		studentCourse=course;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
}
