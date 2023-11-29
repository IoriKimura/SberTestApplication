package com.sbertest.application.dto.models;

import com.sbertest.application.entities.CategoryEntity;
import com.sbertest.application.entities.ProductEntity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductModel {

    private String productName;

    private CategoryModel category;

    private int price;

    private String manufacturer;

    public static ProductModel fromEntity(ProductEntity product){
        return ProductModel.builder()
                .productName(product.getProductName())
                .category(CategoryModel.fromEntity(product.getCategory()))
                .price(product.getPrice())
                .manufacturer(product.getProductManufacturer())
                .build();
    }
}
