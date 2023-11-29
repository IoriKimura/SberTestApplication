package com.sbertest.application.service.category;

import com.sbertest.application.dao.CategoryDao;
import com.sbertest.application.dto.models.CategoryModel;
import com.sbertest.application.dto.requests.CreateCategoryRequest;
import com.sbertest.application.dto.requests.DeleteCategoryRequest;
import com.sbertest.application.entities.CategoryEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
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

    @Override
    public String deleteCategory(DeleteCategoryRequest request) {
        if(categoryDao.findByCategoryName(request.getCategoryName()) == null){
            log.info("No such a category");
            return "Can't find the category";
        }
        categoryDao.deleteCategory(categoryDao.findByCategoryName(request.getCategoryName()));
        return "Successfully deleted";
    }


}
