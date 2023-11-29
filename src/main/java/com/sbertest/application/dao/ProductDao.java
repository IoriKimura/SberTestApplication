package com.sbertest.application.dao;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.entities.ProductEntity;
import com.sbertest.application.repositories.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductDao {

    private final ProductRepo productRepo;

    public ProductModel createProduct(ProductEntity product){
        ProductEntity productEntity = productRepo.save(product);
        return ProductModel.builder()
                .productName(productEntity.getProductName())
                .category(CategoryModel.fromEntity(productEntity.getCategory()))
                .price(productEntity.getPrice())
                .manufacturer(productEntity.getProductManufacturer())
                .build();
    }
}
