package com.example.sd20303.controller;

import com.example.sd20303.model.Student;
import com.example.sd20303.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/poly/student")
    public String detail(Model model) {
        model.addAttribute("fullname", "Nguyen Van Teo");
        return "/home/student.html";
    }

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/student/show")
    public String showStudent(Model model) {

        // lay du lieu tu trong db ra => dung JPA.
        // function findAll() dung de lay toan bo du lieu trong bang student tuong duong voi
        // select * from student
        // select + sort
        //List<Student> list = studentRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        // phan trang
        Pageable pageable = PageRequest.of(3, 10, Sort.Direction.DESC, "id");
        Page<Student> list = studentRepo.findAll(pageable);
        Long count = studentRepo.count();
        System.out.println(count);
        model.addAttribute("list", list);
        return "/home.html";
    }
}
