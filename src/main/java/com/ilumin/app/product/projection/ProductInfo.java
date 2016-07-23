package com.ilumin.app.product.projection;

import com.ilumin.app.category.Category;
import com.ilumin.app.product.Product;
import com.ilumin.app.tag.Tag;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.util.Set;

@Projection(name = "info", types = { Product.class })
public interface ProductInfo {
    String getTitle();
    BigDecimal getPrice();
    Category getCategory();
    Set<Tag> getTags();
}
