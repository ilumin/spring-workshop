package com.ilumin.app.product;

import com.ilumin.app.category.Category;
import com.ilumin.app.tag.Tag;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    @Min(0)
    private BigDecimal price;

    @ManyToOne
    private Category category;

    @ManyToMany(mappedBy = "products")
    private Set<Tag> tags;

    protected Product() {
        this.id = null;
    }

    public Product(String title, BigDecimal price) {
        this();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void addTag(Tag tag) {
        tag.addProduct(this);
        this.tags.add(tag);
    }
}
