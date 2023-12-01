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

/**
 * DAO класс товаров
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class ProductDao {
    /**
     * Поле репозитория {@link ProductRepo}
     */
    private final ProductRepo productRepo;

    /**
     * Метод добавления нового товара
     * @param product добавляемый товар
     * @return добавленный товар в виде {@link ProductModel}
     * @see ProductEntity
     */
    public ProductModel createProduct(ProductEntity product){
        ProductEntity productEntity = productRepo.save(product);
        log.info("Был добавлен новый продукт");
        return ProductModel.builder()
                .productName(productEntity.getProductName())
                .category(CategoryModel.fromEntity(productEntity.getCategory()))
                .price(productEntity.getPrice())
                .manufacturer(productEntity.getProductManufacturer())
                .build();
    }

    /**
     * Метод для поиска всех товаров
     * @return список всех товаров в виде {@link ProductModel}
     * @see ProductModel#fromEntity(ProductEntity)
     */
    public List<ProductModel> getAllProducts() {
        return productRepo.findAll().stream().map(ProductModel::fromEntity).toList();
    }

    /**
     * Метод для поиска товара по его названию
     * @param productName название товара
     * @return сущность товара или null, если товар не был найден
     * @see ProductRepo#findByProductName(String)
     * @see ProductEntity
     */
    public ProductEntity findProductByName(String productName){
        if(productRepo.findByProductName(productName).isPresent()){
            return productRepo.findByProductName(productName).get();
        }
        log.info("Продукт не найден");
        return null;
    }

    /**
     * Метод для удаления товара
     * @param product удаляемый товар
     * @see ProductEntity
     */
    public void deleteProduct(ProductEntity product) {
        log.info("Продукт удалён");
        productRepo.delete(product);
    }

    /**
     * Метод для обновления цены на товар
     * @param product обновляемый товар
     * @return обновлённый товар в виде сущности {@link ProductEntity}
     */
    public ProductEntity updateProduct(ProductEntity product) {
        log.info("Продукт был обновлён");
        return productRepo.save(product);
    }
}
