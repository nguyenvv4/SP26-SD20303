package com.example.sd20303.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Categories")
@Entity
public class Category {

    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Name")
    private String name;
}
