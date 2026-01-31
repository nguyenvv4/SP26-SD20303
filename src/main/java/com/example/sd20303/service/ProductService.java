package com.example.sd20303.service;

import com.example.sd20303.model.Product;
import com.example.sd20303.model.ProductTmp;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void save(Product product);

    List<ProductTmp> getList();

    List<Product> getByCategory(String categoryName, Boolean available);
}
