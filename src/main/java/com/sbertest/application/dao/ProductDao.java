package com.sbertest.application.dao;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.entities.ProductEntity;
import com.sbertest.application.repositories.ProductRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
@Slf4j
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

    public List<ProductModel> getAllProducts() {
        return productRepo.findAll().stream().map(ProductModel::fromEntity).toList();
    }

    public ProductEntity findProductByName(String productName){
        if(productRepo.findByProductName(productName).isPresent()){
            return productRepo.findByProductName(productName).get();
        }
        return null;
    }

    public void deleteProduct(ProductEntity product) {
        productRepo.delete(product);
    }

    public ProductEntity updateProduct(ProductEntity product) {
        return productRepo.save(product);
    }
}
