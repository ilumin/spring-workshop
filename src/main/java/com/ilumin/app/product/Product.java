package com.ilumin.app.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    @Getter
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Integer version;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private BigDecimal price;

    protected Product() {
        this.id = null;
    }

    public Product(String title, BigDecimal price) {
        this();
        this.title = title;
        this.price = price;
    }
}
