package com.SpringRest.Service;

import com.SpringRest.DAO.StudentDAO;
import com.SpringRest.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public Student addStudent(Student student) {
        studentDAO.save(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getOne(id);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteById(id);

    }
}