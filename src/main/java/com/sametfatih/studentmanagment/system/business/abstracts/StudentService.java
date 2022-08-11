package com.sametfatih.studentmanagment.system.business.abstracts;

import java.util.List;

import com.sametfatih.studentmanagment.system.entities.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getByStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
