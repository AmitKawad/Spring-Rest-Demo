package com.SpringRest.DAO;

import com.SpringRest.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentDAO extends JpaRepository<Student,Integer> {
}
