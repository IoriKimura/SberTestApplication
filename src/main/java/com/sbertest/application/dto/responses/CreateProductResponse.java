package com.sbertest.application.dto.responses;

import com.sbertest.application.dto.models.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**DTO класс для ответа на запрос о создании товара*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductResponse {

    /**Поле модель товара
     * @see ProductModel
     * */
    private ProductModel productModel;
}
