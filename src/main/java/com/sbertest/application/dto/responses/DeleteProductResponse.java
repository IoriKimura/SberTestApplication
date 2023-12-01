package com.sbertest.application.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**DTO класс для ответа на запрос об удалении товара*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteProductResponse {

    /**Поле сообщение*/
    private String message;
}
