package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Student stud=context.getBean(Student.class);
		System.out.println(stud);
		stud.studentCheating();
		System.out.println("Hello world from spring application");

	}


}
