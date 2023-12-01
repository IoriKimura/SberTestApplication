package com.sbertest.application.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**DTO класс для запроса на обновление цены товара*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePriceRequest {

    /**Поле имя продукта*/
    private String productName;

    /**Поле цена*/
    private int price;

}
