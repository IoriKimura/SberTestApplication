package com.sbertest.application.repositories;

import com.sbertest.application.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**Интерфейс для реализации репозитория для категорий
 * @see CategoryEntity*/
@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, UUID> {
    /**
     * Метод для поиска категории по названию
     * @param categoryName название категории
     * @return сущность категории {@link CategoryEntity} или значение null
     */
    Optional<CategoryEntity> findByCategoryName(String categoryName);
}
