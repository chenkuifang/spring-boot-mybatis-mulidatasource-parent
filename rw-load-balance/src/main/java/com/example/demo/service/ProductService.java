package com.example.demo.service;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author QuiFar
 * @version V1.0
 **/
public interface ProductService {

    Product get(Long id);

    List<Product> listProduct();

    Integer update(Product product);

    Integer insert(Product product);

    Integer delete(Long id);

    Integer add(Product product);
}
