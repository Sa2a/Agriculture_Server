package com.agriculture.repository;

import com.agriculture.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends JpaRepository<Category, Long> {
    CategoryInfo findByNameEqualsIgnoreCase(String name);
}