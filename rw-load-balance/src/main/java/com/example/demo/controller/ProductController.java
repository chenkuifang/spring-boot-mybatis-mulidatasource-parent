package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Get product by id
     *
     * @param productId
     * @return
     * @throws Exception
     */
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        return productService.get(productId);
    }

    /**
     * Get all product
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/list")
    public List<Product> getAllProduct() {
        return productService.listProduct();
    }

    /**
     * Update product by id
     *
     * @param productId
     * @param newProduct
     * @return
     * @throws Exception
     */
    @PostMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer productId, @RequestBody Product newProduct) {

        return null;

        //return productService.update(productId, newProduct);
    }

    /**
     * Delete product by id
     *
     * @param productId
     * @return
     * @throws Exception
     */
    @DeleteMapping("/{id}")
    public Integer deleteProduct(@PathVariable("id") Long productId) {
        return productService.delete(productId);
    }

    /**
     * Save product
     *
     * @param newProduct
     * @return
     * @throws Exception
     */
    @PostMapping
    public Integer addProduct(@RequestBody Product newProduct) {
        return productService.add(newProduct);
    }
}