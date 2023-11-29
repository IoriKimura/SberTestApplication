package com.sbertest.application.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private CategoryEntity category;

    @Column(name = "product_price")
    private int price;

    @Column(name = "product_manufacturer")
    private String productManufacturer;
}
