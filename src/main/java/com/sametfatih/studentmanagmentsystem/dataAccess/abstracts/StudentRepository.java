package com.sametfatih.studentmanagmentsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sametfatih.studentmanagmentsystem.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
