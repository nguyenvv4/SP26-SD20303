package com.example.sd20303.controller;

import com.example.sd20303.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

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
        // co the dung @RequestParam("username")
        if (account.getUsername().equals("nguyenvv4") && account.getPassword().equals("123456")) {
            model.addAttribute("message", "Login thanh cong");
        } else {
            model.addAttribute("message", "Login khong thanh cong");
        }
        return "home/result.html";
    }

    // vi du ve forward và redirect
    @GetMapping("url1")
    public String url1() {
        return "home/result.html";
    }

    @GetMapping("url2")
    public String url2(
//            Model model
            RedirectAttributes model
    ) {
        model.addAttribute("message", "ahi hi do ngoc");
//        return "forward:/account/url1";
        return "redirect:/account/url1";
    }


    @GetMapping("/hien-thi")
    public String accountHienThi(Model model) {
        List<Account> listAccount = new ArrayList<>();
        listAccount.add(new Account("nguyenvv4", "123456"));
        listAccount.add(new Account("nguyenvv5", "123456"));
        listAccount.add(new Account("nguyenvv6", "123456"));
        listAccount.add(new Account("nguyenvv7", "123456"));
        model.addAttribute("listAccount", listAccount);
        return "/home/account.html";

    }

}
