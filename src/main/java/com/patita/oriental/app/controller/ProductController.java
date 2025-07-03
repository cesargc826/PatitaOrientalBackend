package com.patita.oriental.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patita.oriental.app.model.Product;
import com.patita.oriental.app.service.ProductService;

@CrossOrigin(origins = "*")
@RestController  //@Controller + @ResponseBody
@RequestMapping("/api/v1/products")
public class ProductController {
	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping // ("/api/v1/products") http://localhost:8080/api/v1/roles
	ResponseEntity<Iterable<Product>> getAllProducts(){
		Iterable<Product> products = productService.findAll();
		return ResponseEntity.ok(products);
	}
	
	@GetMapping("/active")
	ResponseEntity<Iterable<Product>> getAllActiveProducts(){
		Iterable<Product> products = productService.getActiveProducts();
		return ResponseEntity.ok(products);
	}
	
	@PostMapping
	ResponseEntity<Product> createProducts(@RequestBody Product product) {
		Product newProduct = productService.save(product);
		return new ResponseEntity<Product> (newProduct, HttpStatus.CREATED); //201
	}
	
	@GetMapping("/{id}")// http://localhost:8080/api/v1/products/1
	Product getProductById(@PathVariable("id") Long id) {
		return productService.findById(id);
	}
	
	@PutMapping("/{id}")
	Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		return productService.update(id, product);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id) {
		productService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
