package com.slmanju.docker.postgres.service;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class ProductView {

    private String id;
    private Integer price;

}
