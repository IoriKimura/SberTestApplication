package com.sbertest.application.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**DTO класс для запроса на удаление товара*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteProductRequest {
    /**Поле имя продукта*/
    private String productName;
}
