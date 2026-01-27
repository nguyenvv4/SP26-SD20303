package com.example.sd20303.service;

import com.example.sd20303.model.Student;

public interface StudentService {

    void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
