package com.zensar.springbootdemo.entity;

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

import com.zensar.springbootdemo.service.StudentService;

@RestController
@RequestMapping("/student-api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	

	// @RequestMapping(value = "/student/{studentId}",method=RequestMethod.GET)
	@GetMapping(value="/students/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		return studentService.getStudent(studentId);
		// System.out.println("studentId"+studentId);
		
	}

	// @RequestMapping(value = {"/students","/listOfStudents" },
	// method=RequestMethod.GET )
	@GetMapping(value = { "/students", "/listOfStudents" },produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();

	}

	// @RequestMapping(value = "/students",method=RequestMethod.POST)
	@PostMapping(value="/students",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void insertStudent(@RequestBody Student student) {
		studentService.insertStudent(student);
		
		// System.out.println("HI");

	}

	// @RequestMapping(value="/students/{studentId}" ,method=RequestMethod.PUT)
	@PutMapping(value="/students/{studentId}",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
		studentService.updateStudent(studentId, student);
	}

	@RequestMapping(value = { "/students,/{studentId}" }, method = RequestMethod.DELETE)
	@DeleteMapping("/students,/{studentId}")
	public void deleteStudent(@PathVariable("studentId") int studentId) {
		studentService.deleteStudent(studentId);
	}

}
