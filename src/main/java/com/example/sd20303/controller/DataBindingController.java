package com.example.sd20303.controller;

import com.example.sd20303.model.SinhVien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataBindingController {
    // mo form
    @GetMapping("/sinh-vien/form")
    public String showForm(Model model
            , @ModelAttribute("sinhVien") SinhVien sinhVien
    ) {
        model.addAttribute("sinhVien", new SinhVien());
        return "/binding-form.html";
    }

    @PostMapping("/sinh-vien/save")
    public String save(Model model, @ModelAttribute("sinhVien") @Valid SinhVien sinhVien,
                       Errors errors) {
        System.out.println(sinhVien.toString());
        if (errors.hasErrors()) {
            model.addAttribute("message", "Da xay ra loi trong qua trinh nhap");
        } else {
            // gia su them khong co loi gi
            model.addAttribute("message", "Thanh cong");
        }
        return "/binding-form.html";
    }
}
