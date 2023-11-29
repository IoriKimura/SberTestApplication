package com.sbertest.application.controllers.v1;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.responses.CreateProductResponse;
import com.sbertest.application.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping("")
    public CreateProductResponse createProduct(@RequestBody CreateProductRequest productRequest){
        ProductModel productModel = productService.createProduct(productRequest);
        return CreateProductResponse.builder().productModel(productModel).build();
    }
}
