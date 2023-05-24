package com.serethewind.searchrestapi.repository;

import com.serethewind.searchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("""
            select p from Product p
            where upper(p.name) like upper(concat('%', :query, '%')) or upper(p.description) like upper(concat('%', :query, '%'))""")
    List<Product> searchByProducts(String query);
}
