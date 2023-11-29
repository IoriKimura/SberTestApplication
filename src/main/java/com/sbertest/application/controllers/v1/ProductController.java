package com.sbertest.application.controllers.v1;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.requests.DeleteProductRequest;
import com.sbertest.application.dto.responses.CreateProductResponse;
import com.sbertest.application.dto.responses.DeleteProductResponse;
import com.sbertest.application.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<ProductModel> getAllProducts(){
        return productService.getProducts();
    }

    @DeleteMapping("")
    public DeleteProductResponse deleteProduct(@RequestBody DeleteProductRequest deleteRequest){
        return DeleteProductResponse.builder()
                .message(productService.deleteProduct(deleteRequest))
                .build();
    }
}
