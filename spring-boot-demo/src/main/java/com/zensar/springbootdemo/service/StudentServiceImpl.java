package com.zensar.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	private List<Student> students = new ArrayList<Student>();
	
	StudentServiceImpl() {
		students.add(new Student(102, "Rebel", 24));
		students.add(new Student(103, "Ravi", 26));
		students.add(new Student(104, "Raju", 25));
	}


	@Override
	public Student getStudent(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {

			}
		}

		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public void insertStudent(Student student) {
		students.add(student);
		
	}

	@Override
	public void updateStudent(int studentId, Student student) {
		Student student2 = getStudent(studentId);
		student2.setStudentId(student.getStudentId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentAge(student.getStudentAge());

		students.add(student2);
		
	}

	@Override
	public void deleteStudent(int studentId) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentId() == studentId) {
				students.remove(student);

			}
		}
		
	}

}
