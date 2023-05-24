package com.serethewind.searchrestapi.service.serviceImpl;

import com.serethewind.searchrestapi.entity.Product;
import com.serethewind.searchrestapi.repository.ProductRepository;
import com.serethewind.searchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchByProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        productRepository.save(product);
        return product;
    }


}
