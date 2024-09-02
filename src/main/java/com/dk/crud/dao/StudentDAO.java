package com.dk.crud.dao;

import java.util.*;

import com.dk.crud.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findbyId(Integer id);
    List<Student> findAll();
}
