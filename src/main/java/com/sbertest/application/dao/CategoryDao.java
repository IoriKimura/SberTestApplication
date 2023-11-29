package com.sbertest.application.dao;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.entities.CategoryEntity;
import com.sbertest.application.repositories.CategoryRepo;
import jakarta.persistence.criteria.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryDao {

    private final CategoryRepo categoryRepo;

    public CategoryModel createCategory(CategoryEntity categoryEntity){
        CategoryEntity category = categoryRepo.save(categoryEntity);
        return CategoryModel.builder()
                .categoryName(category.getCategoryName())
                .build();
    }

    public CategoryEntity findByCategoryName(String categoryName){
        if(categoryRepo.findByCategoryName(categoryName).isPresent()){
            return categoryRepo.findByCategoryName(categoryName).get();
        }
        return null;
    }

    public List<CategoryModel> getAllCategories() {
        return categoryRepo.findAll().stream().map(CategoryModel::fromEntity).toList();
    }
}
