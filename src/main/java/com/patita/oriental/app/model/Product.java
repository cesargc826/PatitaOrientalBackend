package com.patita.oriental.app.model;

import java.math.BigDecimal;

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
	@JoinColumn(name = "id_category")
	private Category categories;
	
	/*@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;*/

	
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
		/*this.createdAt = createdAt;
		this.updatedAt = updatedAt;*/
	}

	
	/*public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}*/

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

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
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
