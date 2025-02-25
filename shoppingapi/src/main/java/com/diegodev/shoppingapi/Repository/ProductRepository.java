package com.diegodev.shoppingapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegodev.shoppingapi.Entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
