package com.sbertest.application.service;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;

public interface CategoryService {

    CategoryModel createCategory(CreateCategoryRequest request);
}