package com.sametfatih.studentmanagmentsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sametfatih.studentmanagmentsystem.business.abstracts.StudentService;
import com.sametfatih.studentmanagmentsystem.dataAccess.abstracts.StudentRepository;
import com.sametfatih.studentmanagmentsystem.entities.Student;

@Service
public class StudentManager implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getByStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}



}
