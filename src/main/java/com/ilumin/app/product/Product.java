package com.ilumin.app.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    private Double price = 0.0;

}
