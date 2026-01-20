package com.example.sd20303.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// gen DB tu entity (khong tao table students trong csdl
// => tu model Student => create table trong DB
@Table(name = "students")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @NotBlank(message = "Khong duoc de trong")
    @Column(name = "StudentCode")
    private String studentCode;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Major")
    private String major;

    @Column(name = "ClassName")
    private String className;


}
