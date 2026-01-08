package com.example.sd20303.service.impl;

import com.example.sd20303.service.HomeService;
import org.springframework.stereotype.Service;

//@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String hienThi() {
        return "home/home-page";
    }
}
