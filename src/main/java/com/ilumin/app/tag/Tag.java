package com.ilumin.app.tag;

import com.ilumin.app.product.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_tags",
            joinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id")
    )
    private Set<Product> products;

    protected Tag() {
        this.id = null;
    }

    public Tag(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        product.addTag(this);
        this.products.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
