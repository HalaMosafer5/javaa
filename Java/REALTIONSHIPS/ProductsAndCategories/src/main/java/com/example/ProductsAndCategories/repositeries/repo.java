package com.example.ProductsAndCategories.repositeries;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productscategories.productscategories.models.Category;
import com.productscategories.productscategories.models.Product;

public interface repo extends JpaRepository<Category, Long> {
	List<Category> findAll();
	Category findByIdIs(Long id);
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);
}
