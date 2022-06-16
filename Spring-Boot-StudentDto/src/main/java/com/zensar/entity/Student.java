package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int StudentId;
	private String StudentName;
	private int StudentAge;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAge = studentAge;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge + "]";
	}
	
}
	