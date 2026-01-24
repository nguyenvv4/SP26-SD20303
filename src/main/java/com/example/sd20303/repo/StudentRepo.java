package com.example.sd20303.repo;

import com.example.sd20303.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repo danh dau day la lop tac dong den csdl
@Repository
//minh đang thao tác với bảng students thì Repo sẽ trỏ đến entity Student
//=>> cách làm
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
