package com.patita.oriental.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.patita.oriental.app.model.Product;
import com.patita.oriental.app.service.ProductService;
import com.patita.oriental.app.reposity.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(Long id) {
		Optional<Product> productOpt = productRepository.findById(id);
		if( productOpt.isEmpty()) { // no hay objeto, la variable contiene null
			throw new IllegalStateException("Product does not exist wih id " + id);
		}
		Product existingProduct = productOpt.get();
		return existingProduct;
	}

	@Override
	public Product save(Product product) {
		product.setId(null);
		Product newProduct = productRepository.save(product);
		return newProduct;
	}

	@Override
	public Product update(Long id, Product product) {
		Product existingProduct = findById(id);
		
		// Solo se modifica los atributos permitidos
		existingProduct.setName(product.getName());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setPriceProduct(product.getPriceProduct());
		existingProduct.setImageUrl(product.getImageUrl());
		existingProduct.setIsActive(product.getIsActive());
		existingProduct.setCategories(product.getCategories());
		//existingProduct.setUpdatedAt(LocalDateTime.now()); // Actualizamos timestamp

		Product updatedProduct = productRepository.save( existingProduct );
		return updatedProduct;
	}

	@Override
	public void deleteById(Long id) {
		Product existingProduct = findById(id);
		existingProduct.setIsActive(false);; // Borrado lógico
		productRepository.save( existingProduct );
		
	}
	
	@Override
	public Iterable<Product> getActiveProducts() {
		return productRepository.findByIsActive(true);
	}

}
