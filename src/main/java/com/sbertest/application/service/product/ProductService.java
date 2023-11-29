package com.sbertest.application.service.product;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;

public interface ProductService {

    ProductModel createProduct(CreateProductRequest request);
}
