package com.sametfatih.studentmanagmentsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	/*
	 * @Autowired private StudentRepository studentRepository;
	 */

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Student student1 = new Student("Samet Fatih", "Gözüm", "samet@hotmail.com");
		 * studentRepository.save(student1); Student student2 = new Student("Ahmet",
		 * "Ilıca", "ilica@hotmail.com"); studentRepository.save(student2); Student
		 * student3 = new Student("Bayram", "Emir", "baemir@hotmail.com");
		 * studentRepository.save(student3);
		 */

	}

}
