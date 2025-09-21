package com.dileep.product_service.service;


import com.dileep.product_service.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    Page<Product> getAllProducts(int page, int size);
    Product getProductById(Long id);
    Product createProduct(Product product);
    void deleteProduct(Long id);
    Product updateProduct(Long id, Product product);
    List<Product> getProductsByIds(List<Long> ids);
}

