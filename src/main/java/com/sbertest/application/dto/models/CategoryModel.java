package com.sbertest.application.dto.models;

import com.sbertest.application.entities.CategoryEntity;
import lombok.*;

import java.util.UUID;

/**
 * DTO model для категорий
 * @author Sergey Ivanov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryModel {

    /**
     * Поле имя категории
     */
    private String categoryName;

    /**
     * Метод для генерации модели из сущности
     * @param category сущность категории {@link CategoryEntity}
     * @return модель категории из сущности
     */
    public static CategoryModel fromEntity(CategoryEntity category){
        return CategoryModel.builder()
                .categoryName(category.getCategoryName())
                .build();
    }
}
