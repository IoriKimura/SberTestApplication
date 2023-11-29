package com.sbertest.application.service.product;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.requests.DeleteProductRequest;
import com.sbertest.application.dto.requests.UpdatePriceRequest;

import java.util.List;

public interface ProductService {

    ProductModel createProduct(CreateProductRequest request);

    List<ProductModel> getProducts();

    String deleteProduct(DeleteProductRequest request);

    ProductModel updateProduct(UpdatePriceRequest request);
}
