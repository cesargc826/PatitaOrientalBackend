package com.patita.oriental.app.reposity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.patita.oriental.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByIsActive(boolean isActive);
}
