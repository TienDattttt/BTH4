package com.WebHandmadeLeather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebHandmadeLeather.domain.Product;
import com.WebHandmadeLeather.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return this.productRepository.findAll();
    }

    @Override
    public List<Product> findByxuhuong(int xuhuong) {
        return this.productRepository.findByxuhuong(xuhuong);
    }

    @Override
    public List<Product> findByphobien(int phobien) {
        return this.productRepository.findByphobien(phobien);
    }

    @Override
    public Product getProductById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean create(Product product) {
        // TODO Auto-generated method stub
        try {
            this.productRepository.save(product);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean delete(Product product) {
        // TODO Auto-generated method stub
        return null;
    }
}