package com.Wealthometer.store.repositories;

import com.Wealthometer.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}