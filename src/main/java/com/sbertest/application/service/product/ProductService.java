package com.sbertest.application.service.product;

import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.requests.DeleteProductRequest;
import com.sbertest.application.dto.requests.UpdatePriceRequest;

import java.util.List;

/**Интерфейс для реализации сервиса товаров*/
public interface ProductService {

    /**
     * Метод для создания товара
     * @param request запрос на создание товара
     * @return модель товара {@link ProductModel}
     * @see CreateProductRequest
     */
    ProductModel createProduct(CreateProductRequest request);

    /**
     * Метод для получения списка всех товаров
     * @return список товаров в виде {@link ProductModel}
     */
    List<ProductModel> getProducts();

    /**
     * Метод для удаления товара
     * @param request запрос на удаление товара
     * @return строка
     * @see DeleteProductRequest
     */
    String deleteProduct(DeleteProductRequest request);

    /**
     * Метод для обновления цены товара
     * @param request запрос на обновление цены товара
     * @return модель изменённого товара {@link ProductModel}
     * @see UpdatePriceRequest
     */
    ProductModel updateProduct(UpdatePriceRequest request);
}
