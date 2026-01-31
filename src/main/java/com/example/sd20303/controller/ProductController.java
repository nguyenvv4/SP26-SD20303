package com.example.sd20303.controller;

import com.example.sd20303.model.Category;
import com.example.sd20303.model.Product;
import com.example.sd20303.model.ProductTmp;
import com.example.sd20303.service.CategoryService;
import com.example.sd20303.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;


    @GetMapping("/product/show")
    public String findAll(Model model) {
        List<Product> products = productService.findAll();
        List<Category> listCategory = categoryService.findAll();
        model.addAttribute("listCategory", listCategory);
        model.addAttribute("listProduct", products);
        return "product.html";
    }

    @PostMapping("/product/save")
    public String save(Product product, Model model) {
        product.setCreateDate(new Date());
        productService.save(product);
        return "redirect:/product/show";
    }

    @GetMapping("/product/showTmp")
    public String showProductTmp(Model model) {
        List<ProductTmp> productTmpList = productService.getList();
        model.addAttribute("productTmpList", productTmpList);
        List<Product> getByCategory = productService.getByCategory("Áo thun", false);
        System.out.println(getByCategory.toString());

        return "product.html";
    }
}
