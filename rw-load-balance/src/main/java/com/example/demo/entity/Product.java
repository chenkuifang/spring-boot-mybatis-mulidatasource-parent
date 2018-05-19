package com.example.demo.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 实体类
 *
 * @author QuiFar
 */
@Data
public class Product {

    private Long id;
    private String name;
    private BigDecimal price;
}
