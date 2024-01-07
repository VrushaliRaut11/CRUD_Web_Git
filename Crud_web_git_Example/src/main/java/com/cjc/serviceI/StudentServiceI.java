package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.Student;

public interface StudentServiceI {

	void saveStudent(Student s);

	List getStudents();

}
