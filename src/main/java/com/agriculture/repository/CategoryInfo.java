package com.agriculture.repository;

import com.agriculture.entities.Category;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;
@Projection(
        name = "customInfo",
        types = { Category.class })
public interface CategoryInfo {
    Long getId();

    String getImageLocation();

    String getName();

    List<ProductInfo> getProducts();

    interface ProductInfo {
        Long getId();

        Category getCategory();

        String getName();

        Double getPrice();
    }
}
