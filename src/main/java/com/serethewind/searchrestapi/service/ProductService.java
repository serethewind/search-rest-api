package com.serethewind.searchrestapi.service;

import com.serethewind.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
