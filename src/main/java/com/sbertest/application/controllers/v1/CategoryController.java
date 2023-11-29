package com.sbertest.application.controllers.v1;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;
import com.sbertest.application.dto.responses.CreateCategoryResponse;
import com.sbertest.application.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("")
    public CreateCategoryResponse createCategory(@RequestBody CreateCategoryRequest categoryRequest){
        CategoryModel categoryModel = categoryService.createCategory(categoryRequest);
        return CreateCategoryResponse.builder()
                .categoryModel(categoryModel)
                .build();
    }
}
