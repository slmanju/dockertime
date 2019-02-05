package com.slmanju.docker.postgres.service;

import java.util.List;

public interface ProductService {

    ProductView save(ProductView productView);

    List<ProductView> findAll();

    ProductView findById(String id);

}
