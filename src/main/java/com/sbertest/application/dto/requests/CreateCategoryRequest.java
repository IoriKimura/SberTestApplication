package com.sbertest.application.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * DTO класс для запроса на создание категории
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryRequest {
    /**
     * Поле имя категории
     */
    private String categoryName;

}
