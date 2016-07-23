package com.ilumin.app.product.projection;

import com.ilumin.app.category.Category;
import com.ilumin.app.product.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "info", types = { Product.class })
public interface ProductInfo {
    String getTitle();
    String getPrice();
    Category getCategory();
}
