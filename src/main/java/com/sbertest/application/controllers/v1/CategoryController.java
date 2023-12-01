package com.sbertest.application.controllers.v1;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;
import com.sbertest.application.dto.requests.DeleteCategoryRequest;
import com.sbertest.application.dto.responses.CreateCategoryResponse;
import com.sbertest.application.dto.responses.DeleteCategoryResponse;
import com.sbertest.application.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Класс @RestController для категории товаров
* */
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/category")
public class CategoryController {

    /** Поле сервиса {@link CategoryService}*/
    private final CategoryService categoryService;

    /** POST метод на добавление новой категории
     * @param categoryRequest запрос на добавление
     * @return ответ на добавление новой категории {@link CreateCategoryResponse}
     * @see CreateCategoryRequest
     * */
    @PostMapping("")
    public CreateCategoryResponse createCategory(@RequestBody CreateCategoryRequest categoryRequest){
        CategoryModel categoryModel = categoryService.createCategory(categoryRequest);
        return CreateCategoryResponse.builder()
                .categoryModel(categoryModel)
                .build();
    }

    /** GET метод на просмотр всех категорий
     * @return список всех категорий
     * @see CategoryService#getCategories()
     * */
    @GetMapping("")
    public List<CategoryModel> getCategories(){
        return categoryService.getCategories();
    }

    /** DELETE метод на удаление категории
     * @param deleteRequest - запрос на удаление
     * @return ответ на удаление {@link DeleteCategoryResponse}
     * @see DeleteCategoryRequest
     * */
    @DeleteMapping("")
    public DeleteCategoryResponse deleteCategory(@RequestBody DeleteCategoryRequest deleteRequest){
        return DeleteCategoryResponse.builder()
                .message(categoryService.deleteCategory(deleteRequest))
                .build();
    }
}
