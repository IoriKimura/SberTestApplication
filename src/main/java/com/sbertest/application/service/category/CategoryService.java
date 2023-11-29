package com.sbertest.application.service.category;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;

public interface CategoryService {

    CategoryModel createCategory(CreateCategoryRequest request);
}
