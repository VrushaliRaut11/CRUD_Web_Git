package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.serviceI.StudentServiceI;

@RestController
public class StudentController 
{
	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s)
	{
		ssi.saveStudent(s);
		return new ResponseEntity<Student>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity<List<Student>> getStudents()
	{
		List list=ssi.getStudents();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}

}
