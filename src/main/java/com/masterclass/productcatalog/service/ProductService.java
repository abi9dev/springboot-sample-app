package com.masterclass.productcatalog.service;

import com.masterclass.productcatalog.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    List<Product> getProductsByCategory(String category);
    List<Product> searchProducts(String keyword);
}