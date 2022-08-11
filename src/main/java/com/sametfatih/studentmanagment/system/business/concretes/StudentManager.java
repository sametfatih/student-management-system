package com.sametfatih.studentmanagment.system.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sametfatih.studentmanagment.system.business.abstracts.StudentService;
import com.sametfatih.studentmanagment.system.dataAccess.abstracts.StudentRepository;
import com.sametfatih.studentmanagment.system.entities.Student;

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
