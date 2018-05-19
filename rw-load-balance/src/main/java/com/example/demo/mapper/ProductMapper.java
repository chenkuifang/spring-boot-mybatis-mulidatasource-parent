package com.example.demo.mapper;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 映射接口
 *
 * @author QuiFar
 */
@Mapper
public interface ProductMapper {

    Product get(@Param("id") Long id);

    List<Product> list();

    Integer update(Product product);

    Integer insert(Product product);

    Integer delete(Long id);

    Integer add(Product product);
}
