package com.example.sd20303.controller;

import com.example.sd20303.model.Account;
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
    public String login(Account account,
                        Model model) {
        // co the dung @RequestParam
        if (account.getUsername().equals("nguyenvv4") && account.getPassword().equals("123456")) {
            model.addAttribute("message", "Login thanh cong");
        } else {
            model.addAttribute("message", "Login khong thanh cong");
        }
        return "home/result.html";
    }
}
