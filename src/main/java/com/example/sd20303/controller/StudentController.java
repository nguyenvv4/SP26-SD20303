package com.example.sd20303.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/poly/student")
    public String detail(Model model) {
        model.addAttribute("fullname", "Nguyen Van Teo");
        return "/home/student.html";
    }
}
