package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
