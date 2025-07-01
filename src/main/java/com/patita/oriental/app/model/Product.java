package com.patita.oriental.app.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 45)
	private String name;
	
	@Column(name = "description", nullable = false, length = 250)
	private String description;
	
	@Column(name = "price_product", nullable = false, precision = 10, scale = 2)
	private BigDecimal priceProduct;
	
	@Column(name = "image_url", nullable = false, length = 100)
	private String imageUrl;
	
	@Column(name = "is_active", nullable = false)
	private boolean isActive;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_menu")
	private Category categories;

	
	public Product() {
		
	}

	public Product(Long id, String name, String description, BigDecimal priceProduct, String imageUrl,
			boolean isActive, Category categories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.priceProduct = priceProduct;
		this.imageUrl = imageUrl;
		this.isActive = isActive;
		this.categories = categories;
	}

	public Category getCategories() {
		return categories;
	}

	public void setCategories(Category categories) {
		this.categories = categories;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(BigDecimal priceProduct) {
		this.priceProduct = priceProduct;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", priceProduct=");
		builder.append(priceProduct);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append("]");
		return builder.toString();
	}
	
	
}
