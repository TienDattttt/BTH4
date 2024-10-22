package com.WebHandmadeLeather.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.WebHandmadeLeather.domain.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByxuhuong(int xuhuong);

    List<Product> findByphobien(int phobien);
}
