package com.sbertest.application.dao;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.entities.CategoryEntity;
import com.sbertest.application.repositories.CategoryRepo;
import jakarta.persistence.criteria.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * DAO класс категорий
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class CategoryDao {

    /**
     * Поле репозитория {@link CategoryRepo}
     */
    private final CategoryRepo categoryRepo;

    /**
     * Метод создания новой категории
     * @param categoryEntity добавляемая категории
     * @return добавленную категорию в виде {@link CategoryModel}
     * @see CategoryEntity
     */
    public CategoryModel createCategory(CategoryEntity categoryEntity){
        CategoryEntity category = categoryRepo.save(categoryEntity);
        log.info("Добавлена новая категория товаров");
        return CategoryModel.builder()
                .categoryName(category.getCategoryName())
                .build();
    }

    /**
     * Метод для поиска категории по её названию
     * @param categoryName название категории
     * @return сущность категории или null, если категория не была найдена
     * @see CategoryRepo#findByCategoryName(String) 
     * @see CategoryEntity
     */
    public CategoryEntity findByCategoryName(String categoryName){
        if(categoryRepo.findByCategoryName(categoryName).isPresent()){
            return categoryRepo.findByCategoryName(categoryName).get();
        }
        log.info("Категория товаров не найдена");
        return null;
    }

    /**
     * Метод для поиска всех категорий
     * @return список всех категорий в виде {@link CategoryModel}
     * @see CategoryModel#fromEntity(CategoryEntity)
     */
    public List<CategoryModel> getAllCategories() {
        return categoryRepo.findAll().stream().map(CategoryModel::fromEntity).toList();
    }

    /**
     * Метод для удаления категории
     * @param category удаляемая категория
     * @see CategoryEntity
     */
    public void deleteCategory(CategoryEntity category) {
        log.info("Категория была удалена");
        categoryRepo.delete(category);
    }
}
