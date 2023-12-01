package com.sbertest.application.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**DTO класс для запроса на удаление категории*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCategoryRequest {

    /**Поле имя категории*/
    private String categoryName;
}
