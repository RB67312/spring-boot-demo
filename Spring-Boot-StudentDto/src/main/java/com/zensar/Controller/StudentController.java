package com.zensar.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.Service.StudentServiceImpl;
import com.zensar.dto.StudentDto;
import com.zensar.entity.Student;

@RestController
@RequestMapping(value="/student-api",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public class StudentController {
	@Autowired
	private StudentServiceImpl studentservice;

	// @RequestMapping("/students/{StudentId}")
	@GetMapping(value = "/student/{StudentId}")
	public Student getStudent(@PathVariable("StudentId") int StudentId) {
		return studentservice.getStudent(StudentId);
	}

	// @RequestMapping(value={"/students","/listofstudents"},method=RequestMethod.GET)
	@GetMapping(value = { "/students", "/listofstudents" })
	public List<Student> getAllStudent() {
		return studentservice.getAllStudent();
	}

	//@RequestMapping(value = "/students", method = RequestMethod.POST)
	@PostMapping(value = "/students")
	public void insertStudent(@RequestBody StudentDto studentDto) {
		
		
		studentservice.insertStudent(studentDto);
		
	}

	// @RequestMapping(value = "/students/{studentId}", method = RequestMethod.PUT)
	@PutMapping(value = "/students/{studentId}")
	public void updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
		studentservice.updateStudent(studentId, student);
	}

	// @RequestMapping(value = "/students/{studentId}", method =
	// RequestMethod.DELETE)
	@DeleteMapping(value = "/students/{studentId}")
	public void deleteStudent(@PathVariable("studentId") int studentId) {
		studentservice.deleteStudent(studentId);

	}
}
