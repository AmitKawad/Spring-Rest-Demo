package com.SpringRest.Controller;


import com.SpringRest.Model.Student;
import com.SpringRest.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyController {

    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String homeController(){
        return "This is test controller";
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable String id){

        studentService.deleteStudent(Integer.parseInt(id));
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable String id){
       return studentService.getStudentById(Integer.parseInt(id));
    }


}

