package com.sbertest.application.dto.responses;

import com.sbertest.application.dto.models.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteProductResponse {
    private String message;
}
