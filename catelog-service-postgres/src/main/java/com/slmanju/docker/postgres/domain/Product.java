package com.slmanju.docker.postgres.domain;

import com.slmanju.docker.postgres.service.ProductView;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Data @NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid")
    private String id;
    private Integer price;

    public static Product of(ProductView productView) {
        Product product = new Product();
        product.id = productView.getId();
        product.price = productView.getPrice();
        return product;
    }

    public ProductView view() {
        return ProductView.builder().id(id).price(price).build();
    }

}
