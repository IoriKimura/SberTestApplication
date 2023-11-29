package com.sbertest.application.dto.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductModel {

    private String productName;

    private CategoryModel category;

    private int price;

    private String manufacturer;
}
