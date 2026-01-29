package com.example.sd20303.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Products")
@Entity

public class Product {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Image")
    private String image;

    @Column(name = "Price")
    private Float price;

    @Temporal(TemporalType.DATE)
    @Column(name = "CreateDate")
    private Date createDate;
    // gia su trong db la create_date => tai dong 33 khong can @Colunm nua
    // trong db la create_date spring hieu bien la createDate

    @Column(name = "Available")
    private Boolean available;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;


}
