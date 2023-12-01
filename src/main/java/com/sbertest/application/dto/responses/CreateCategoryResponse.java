package com.sbertest.application.dto.responses;

import com.sbertest.application.dto.models.CategoryModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**DTO класс для ответа на запрос о создании категории*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCategoryResponse {

    /**Поле модель категории
     * @see CategoryModel*/
    private CategoryModel categoryModel;
}
