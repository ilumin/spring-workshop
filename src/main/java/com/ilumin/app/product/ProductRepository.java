package com.ilumin.app.product;

import com.ilumin.app.product.projection.ProductInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ProductInfo.class)
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
