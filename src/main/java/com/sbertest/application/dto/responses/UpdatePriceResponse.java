package com.sbertest.application.dto.responses;

import com.sbertest.application.dto.models.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**DTO класс для ответа на запрос об обновлении цены товара*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePriceResponse {

    /**Поле модель товара
     * @see ProductModel*/
    private ProductModel productModel;
}
