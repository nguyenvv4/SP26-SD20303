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

    @Query(value = "select p.* from Products p inner join Categories C on C.Id = p.CategoryId\n" +
            "where C.Name = ?1 and p.Available = ?2", nativeQuery = true)
    List<Product> getProductByCategory(String categoryName, Boolean available);
}
