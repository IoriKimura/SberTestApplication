package com.sbertest.application.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

/**Класс, описывающий сущность Товар*/
@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    /**Поле идентификатор*/
    @Id
    @UuidGenerator
    private UUID id;

    /**Поле имя продукта*/
    @Column(name = "product_name")
    private String productName;

    /**Поле категория
     * @see CategoryEntity*/
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private CategoryEntity category;

    /**Поле цена*/
    @Column(name = "product_price")
    private int price;

    /**Поле производитель*/
    @Column(name = "product_manufacturer")
    private String productManufacturer;
}
