package com.bat.msbdemo.api.service;

import java.util.List;

import com.bat.msbdemo.api.entity.Student;

public interface StudentService {

    public List<Student> getAllStudent();

    public Student addStudent(Student student);
}
