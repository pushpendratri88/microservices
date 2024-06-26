package com.brainstorm.order.repository;

import com.brainstorm.order.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product , String> {
    Optional<Product> findById(String productCode);
}

