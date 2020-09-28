package com.SpringRest.Service;


import com.SpringRest.Model.Student;

import java.util.List;

public interface StudentService {


    public Student addStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(int id);
    public void deleteStudent(int id);

}
