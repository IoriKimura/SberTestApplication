package com.sbertest.application.controllers.v1;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.requests.DeleteProductRequest;
import com.sbertest.application.dto.requests.UpdatePriceRequest;
import com.sbertest.application.dto.responses.CreateProductResponse;
import com.sbertest.application.dto.responses.DeleteProductResponse;
import com.sbertest.application.service.category.CategoryService;
import com.sbertest.application.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Класс @RestController для товаров
 * */
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/products")
public class ProductController {

    /** Поле сервиса для товаров {@link ProductService}*/
    private final ProductService productService;

    /** POST метод на добавление нового товара
     * @param productRequest запрос на добавление
     * @return ответ на добавление {@link CreateProductResponse}
     * @see CreateProductRequest
     * */
    @PostMapping("")
    public CreateProductResponse createProduct(@RequestBody CreateProductRequest productRequest){
        ProductModel productModel = productService.createProduct(productRequest);
        return CreateProductResponse.builder().productModel(productModel).build();
    }

    /** GET метод на получение списка товаров
     * @return список всех товаров
     * @see ProductService#getProducts()
     * */
    @GetMapping("")
    public List<ProductModel> getAllProducts(){
        return productService.getProducts();
    }

    /**
     * DELETE метод для удаления товара
     * @param deleteRequest запрос на удаление
     * @return ответ на удаление {@link DeleteProductResponse}
     * @see DeleteProductRequest
     */
    @DeleteMapping("")
    public DeleteProductResponse deleteProduct(@RequestBody DeleteProductRequest deleteRequest){
        return DeleteProductResponse.builder()
                .message(productService.deleteProduct(deleteRequest))
                .build();
    }

    /**
     * POST метод для обновления цены товара
     * @param updateRequest запрос на обновление
     * @return изменённый продукт {@link ProductService#updateProduct(UpdatePriceRequest)}
     * @see UpdatePriceRequest
     * @see ProductModel
     */
    @PostMapping("/update")
    public ProductModel updateProduct(@RequestBody UpdatePriceRequest updateRequest){
        return productService.updateProduct(updateRequest);
    }
}
