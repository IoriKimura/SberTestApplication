package com.sbertest.application.service.category;

import com.sbertest.application.dao.CategoryDao;
import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;
import com.sbertest.application.dto.requests.DeleteCategoryRequest;
import com.sbertest.application.entities.CategoryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**Класс, имплементирующий {@link CategoryService}*/
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    /**Поле {@link CategoryDao}*/
    private final CategoryDao categoryDao;

    /**
     * Метод для создания категории
     * @param request запрос на создание категории
     * @return модель категории {@link CategoryModel}
     * @see CategoryEntity
     * @see CreateCategoryRequest
     */
    @Override
    public CategoryModel createCategory(CreateCategoryRequest request) {
        CategoryEntity category = CategoryEntity.builder()
                .categoryName(request.getCategoryName())
                .build();

        return categoryDao.createCategory(category);
    }

    /**
     * Метод для получения списка всех категорий
     * @return список всех категорий в виде {@link CategoryModel}
     */
    @Override
    public List<CategoryModel> getCategories() {
        return categoryDao.getAllCategories();
    }

    /**
     * Метод для удаления категории
     * @param request запрос на удаление категории
     * @return строка с результатом по итогам удаления
     * @see DeleteCategoryRequest
     */
    @Override
    public String deleteCategory(DeleteCategoryRequest request) {
        if(categoryDao.findByCategoryName(request.getCategoryName()) == null){
            return "Не получилось найти категорию";
        }
        categoryDao.deleteCategory(categoryDao.findByCategoryName(request.getCategoryName()));
        return "Категория успешно удалена";
    }


}
