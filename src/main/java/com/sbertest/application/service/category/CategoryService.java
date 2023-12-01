package com.sbertest.application.service.category;

import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;
import com.sbertest.application.dto.requests.DeleteCategoryRequest;

import java.util.List;

/**Интерфейс для реализации сервиса категорий*/
public interface CategoryService {

    /**
     * Метод для создания категории
     * @param request запрос на создание категории
     * @return модель категории {@link CategoryModel}
     * @see CreateCategoryRequest
     */
    CategoryModel createCategory(CreateCategoryRequest request);

    /**
     * Метод для получения списка всех категорий
     * @return список всех категорий в виде моделей
     * @see CategoryModel
     */
    List<CategoryModel> getCategories();

    /**
     * Метод для удаления категории
     * @param request запрос на удаление категории
     * @return строка
     * @see DeleteCategoryRequest
     */
    String deleteCategory(DeleteCategoryRequest request);
}
