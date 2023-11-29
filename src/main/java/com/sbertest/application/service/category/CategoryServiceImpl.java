package com.sbertest.application.service.category;

import com.sbertest.application.dao.CategoryDao;
import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;
import com.sbertest.application.entities.CategoryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao;
    @Override
    public CategoryModel createCategory(CreateCategoryRequest request) {
        CategoryEntity category = CategoryEntity.builder()
                .categoryName(request.getCategoryName())
                .build();

        return categoryDao.createCategory(category);
    }

    @Override
    public List<CategoryModel> getCategories() {
        return categoryDao.getAllCategories();
    }
}
