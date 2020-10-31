package com.SpringRest;

import com.SpringRest.DAO.StudentDAO;
import com.SpringRest.Model.Student;
import com.SpringRest.Service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;


import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringRestApplicationTests {
	@Autowired
	StudentService studentService;

	@MockBean
	StudentDAO studentDAO;

	@Test
	public void testAddStudent() {
		Student student = new Student(1, "testFirstNAme", "testLastNAme");
		Mockito.when(studentDAO.save(Mockito.any(Student.class))).thenReturn(student);
		assertThat(student).isEqualTo(studentService.addStudent(student));

	}
}
