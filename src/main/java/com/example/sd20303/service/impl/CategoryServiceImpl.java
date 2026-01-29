package com.example.sd20303.service.impl;

import com.example.sd20303.model.Category;
import com.example.sd20303.repo.CategoryRepo;
import com.example.sd20303.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}
