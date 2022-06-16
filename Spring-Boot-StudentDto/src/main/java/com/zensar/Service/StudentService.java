package com.zensar.Service;

import java.util.List;

import com.zensar.dto.StudentDto;
import com.zensar.entity.Student;

public interface StudentService {
	public Student getStudent(int StudentId);

	public List<Student> getAllStudent();

	public void insertStudent(StudentDto studentDto);

	public void updateStudent(int studentId, Student student);

	public void deleteStudent(int studentId);
}
