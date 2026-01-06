package com.example.sd20303.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/sd20303/list")
    public String list(Model model) {
        model.addAttribute("name", "Nguyen Van A");
        // return về file html (nếu có trong thư mục thì /thư mục/tên file
        return "home/home-page";
    }
}
