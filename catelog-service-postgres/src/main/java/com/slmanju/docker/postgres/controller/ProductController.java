package com.slmanju.docker.postgres.controller;

import com.slmanju.docker.postgres.service.ProductService;
import com.slmanju.docker.postgres.service.ProductView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/echo")
    public ResponseEntity<String> echo() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/products/save")
    public ResponseEntity<ProductView> save(@RequestBody ProductView productView) {
        LOGGER.info(":: save :: ", productView);
        return ResponseEntity.ok(productService.save(productView));
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductView>> findAll() {
        LOGGER.info(":: find all ::");
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductView> findById(@PathVariable("id") String id) {
        LOGGER.info(":: find by id ::", id);
        return ResponseEntity.ok(productService.findById(id));
    }

}
