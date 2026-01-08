package com.example.sd20303.controller;

import com.example.sd20303.service.HomeService;
import com.example.sd20303.service.impl.Home1ServiceImpl;
import com.example.sd20303.service.impl.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //    @Autowired
//    HomeService homeService;
    HomeServiceImpl homeServiceImpl = new HomeServiceImpl();

    @RequestMapping("/sd20303/list")
    public String list(Model model) {
//        model.addAttribute("name", "Nguyen Van A");
        // return về file html (nếu có trong thư mục thì /thư mục/tên file
        return homeServiceImpl.hienThi();
    }

    @RequestMapping({"/user", "/user1"})
    public String hienThi() {
        return "home/x.html";
    }
}
