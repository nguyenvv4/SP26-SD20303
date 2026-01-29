package com.example.sd20303.repo;

import com.example.sd20303.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM Products order by Price DESC", nativeQuery = true)
    List<Product> getProduct();
}
