package com.WebHandmadeLeather.service;

import java.util.List;

import com.WebHandmadeLeather.domain.Product;

public interface ProductService {
    List<Product> getAll();

    List<Product> findByxuhuong(int xuhuong);

    List<Product> findByphobien(int phobien);

    Product getProductById(String id);

    Boolean create(Product product);

    Boolean update(Product product);

    Boolean delete(Product product);
}
