package com.serethewind.searchrestapi.controller;

import com.serethewind.searchrestapi.entity.Product;
import com.serethewind.searchrestapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> fetchByQuery(@RequestParam("queryInput") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.createProduct(product));
    }
}
