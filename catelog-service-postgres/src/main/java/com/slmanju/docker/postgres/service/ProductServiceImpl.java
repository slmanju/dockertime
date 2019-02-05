package com.slmanju.docker.postgres.service;

import com.slmanju.docker.postgres.domain.Product;
import com.slmanju.docker.postgres.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductView save(ProductView productView) {
        Product product = productRepository.save(Product.of(productView));
        return product.view();
    }

    @Override
    public List<ProductView> findAll() {
        return productRepository.findAll()
                .stream()
                .map(Product::view)
                .collect(toList());
    }

    @Override
    public ProductView findById(String id) {
        return productRepository.findById(id).map(Product::view).orElse(null);
    }

}
