package com.sbertest.application.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    private String productName;

    private String categoryName;

    private int price;

    private String manufacturer;
}
