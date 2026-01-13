package com.example.sd20303.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("account")
public class AccountController {
    // mo trang login
    @GetMapping("login")
    public String login() {
        return "home/login.html";
    }

    // thao tac login
    @PostMapping("login")
    public String login(@RequestParam("username") String un, @RequestParam("password") String pw,
                        Model model) {
        System.out.println(un);
        System.out.println(pw);
        if (un.equals("nguyenvv4") && pw.equals("123456")) {
            model.addAttribute("message", "Login thanh cong");
        } else {
            model.addAttribute("message", "Login khong thanh cong");
        }
        return "home/result.html";
    }
}
