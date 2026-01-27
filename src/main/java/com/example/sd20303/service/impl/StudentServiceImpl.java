package com.example.sd20303.service.impl;

import com.example.sd20303.model.Student;
import com.example.sd20303.repo.StudentRepo;
import com.example.sd20303.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void deleteStudent(int id) {

    }
}
