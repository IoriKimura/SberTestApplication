package com.sbertest.application.service.category;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;

import java.util.List;

public interface CategoryService {

    CategoryModel createCategory(CreateCategoryRequest request);

    List<CategoryModel> getCategories();
}
