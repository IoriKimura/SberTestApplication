package com.sbertest.application.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO класс для запроса на создание товара
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    /**Поле имя продукта*/
    private String productName;

    /**Поле имя категории*/
    private String categoryName;

    /**Поле цена*/
    private int price;

    /**Поле производитель*/
    private String manufacturer;
}
