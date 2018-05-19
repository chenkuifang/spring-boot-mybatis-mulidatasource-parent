package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现类
 *
 * @author QuiFar
 * @version V1.0
 **/
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public Product get(Long id) {
        return productMapper.get(id);
    }

    @Override
    public List<Product> listProduct() {
        return productMapper.list();
    }

    @Override
    public Integer update(Product product) {
        return productMapper.update(product);
    }

    @Override
    public Integer insert(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public Integer delete(Long productId) {
        return productMapper.delete(productId);
    }

    @Override
    public Integer add(Product product) {
        return productMapper.add(product);
    }
}
