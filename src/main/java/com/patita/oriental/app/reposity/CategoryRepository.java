package com.patita.oriental.app.reposity;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.patita.oriental.app.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	Optional<Category> findByName (String name);
}
