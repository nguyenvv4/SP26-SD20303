package com.example.sd20303.service;

import com.example.sd20303.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void save(Product product);
}
