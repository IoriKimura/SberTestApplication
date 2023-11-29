package com.sbertest.application.dto.responses;

import com.sbertest.application.dto.models.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePriceResponse {

    private ProductModel productModel;
}
