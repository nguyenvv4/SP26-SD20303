package com.example.sd20303.repo;

import com.example.sd20303.model.ProductTmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductTmpRepo extends JpaRepository<ProductTmp, String> {

    @Query(value = "select c.Id, c.Name, count(P.CategoryId) as 'so_luong' from Categories c inner join Products P on c.Id = P.CategoryId\n" +
            "group by c.Name, c.Id", nativeQuery = true)
    List<ProductTmp> getList();
}
