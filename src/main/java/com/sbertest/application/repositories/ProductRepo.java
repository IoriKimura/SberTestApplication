package com.sbertest.application.repositories;

import com.sbertest.application.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
/**Интерфейс для реализации репозитория для товаров*/
@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, UUID> {
    /**
     * Метод для поиска товара по названию
     * @param productName название товара
     * @return сущность товара {@link ProductEntity} или null значение
     */
    Optional<ProductEntity> findByProductName(String productName);
}
