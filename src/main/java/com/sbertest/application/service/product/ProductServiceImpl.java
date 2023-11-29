package com.sbertest.application.service.product;

import com.sbertest.application.dao.CategoryDao;
import com.sbertest.application.dao.ProductDao;
import com.sbertest.application.dto.models.ProductModel;
import com.sbertest.application.dto.requests.CreateProductRequest;
import com.sbertest.application.dto.requests.DeleteProductRequest;
import com.sbertest.application.dto.requests.UpdatePriceRequest;
import com.sbertest.application.entities.CategoryEntity;
import com.sbertest.application.entities.ProductEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductDao productDao;
    private final CategoryDao categoryDao;


    @Override
    public ProductModel createProduct(CreateProductRequest request) {
        CategoryEntity category = categoryDao.findByCategoryName(request.getCategoryName());
        if(category == null) {
            log.info("No such a category");
            throw new NoSuchElementException("Can't find the category");
        }

        ProductEntity product = ProductEntity.builder()
                .productName(request.getProductName())
                .category(category)
                .price(request.getPrice())
                .productManufacturer(request.getManufacturer())
                .build();

        return productDao.createProduct(product);
    }

    @Override
    public List<ProductModel> getProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public String deleteProduct(DeleteProductRequest request) {
        if(productDao.findProductByName(request.getProductName()) == null){
            log.info("No such a product");
            return "Can't find the product";
        }
        productDao.deleteProduct(productDao.findProductByName(request.getProductName()));
        return "Successfully deleted";
    }

    @Override
    public ProductModel updateProduct(UpdatePriceRequest request) {
        if(productDao.findProductByName(request.getProductName()) == null) {
            log.info("No such a product");
            throw new NoSuchElementException("Can't find the product");
        }
        ProductEntity product = productDao.findProductByName(request.getProductName());
        product.setPrice(request.getPrice());

        return ProductModel.fromEntity(productDao.updateProduct(product));

    }
}
