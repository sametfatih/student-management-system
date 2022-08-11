package com.sametfatih.studentmanagmentsystem.business.abstracts;

import java.util.List;

import com.sametfatih.studentmanagmentsystem.entities.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getByStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
