package com.patita.oriental.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.patita.oriental.app.model.Category;
import com.patita.oriental.app.reposity.CategoryRepository;

@Component
public class CategoryDataLoader implements CommandLineRunner{
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		if(categoryRepository.count()==0) {
			categoryRepository.save(new Category(null, "Comida"));
			categoryRepository.save(new Category(null, "Bebida"));
			categoryRepository.save(new Category(null, "Postre"));
		}
	}

}
