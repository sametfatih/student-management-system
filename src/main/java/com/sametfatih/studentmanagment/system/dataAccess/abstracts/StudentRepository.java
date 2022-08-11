package com.sametfatih.studentmanagment.system.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sametfatih.studentmanagment.system.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
