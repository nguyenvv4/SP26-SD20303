package com.example.sd20303.service.impl;

import com.example.sd20303.model.Product;
import com.example.sd20303.repo.CategoryRepo;
import com.example.sd20303.repo.ProductRepo;
import com.example.sd20303.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.getProduct();
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }
}
