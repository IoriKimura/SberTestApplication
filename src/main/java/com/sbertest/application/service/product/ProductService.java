package com.sbertest.application.service.product;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.requests.DeleteProductRequest;

import java.util.List;

public interface ProductService {

    ProductModel createProduct(CreateProductRequest request);

    List<ProductModel> getProducts();

    String deleteProduct(DeleteProductRequest request);
}
