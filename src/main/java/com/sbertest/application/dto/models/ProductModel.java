package com.sbertest.application.dto.models;

import com.sbertest.application.entities.ProductEntity;
import lombok.*;

/**
 * DTO model класс для товаров
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductModel {

    /**
     * Поле имя продукта
     */
    private String productName;

    /**
     * Поле категория {@link CategoryModel}
     */
    private CategoryModel category;

    /**
     * Поле цена
     */
    private int price;

    /**
     * Поле производитель
     */
    private String manufacturer;

    /**
     * Метод генерации модели из сущности
     * @param product сущность товара {@link ProductEntity}
     * @return модель товара из сущности
     */
    public static ProductModel fromEntity(ProductEntity product){
        return ProductModel.builder()
                .productName(product.getProductName())
                .category(CategoryModel.fromEntity(product.getCategory()))
                .price(product.getPrice())
                .manufacturer(product.getProductManufacturer())
                .build();
    }
}
