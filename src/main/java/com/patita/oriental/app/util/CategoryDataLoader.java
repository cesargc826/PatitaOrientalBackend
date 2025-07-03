package com.patita.oriental.app.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.patita.oriental.app.model.Category;
import com.patita.oriental.app.reposity.CategoryRepository;

@Component
@Order(1)
public class CategoryDataLoader implements CommandLineRunner{
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		if (categoryRepository.count() == 0) {
            Category comida = new Category(null, "Comida");
            Category bebida = new Category(null, "Bebida");
            Category postre = new Category(null, "Postre");
            Category menuTematico = new Category(null, "Menú Temático");

            categoryRepository.saveAll(List.of(comida, bebida, postre, menuTematico));
            System.out.println("Categorías insertadas correctamente.");
        } else {
            System.out.println("Ya existen categorías en la base de datos. No se insertaron duplicados.");
        }
	}

}
