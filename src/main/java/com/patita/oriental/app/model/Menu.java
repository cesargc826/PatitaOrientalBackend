package com.patita.oriental.app.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 45)
	private String name;
	
	@Column(name = "description", nullable = false, length = 250)
	private String description;
	
	@Column(name = "price_menu", nullable = false, precision = 10, scale = 2)
	private BigDecimal priceMenu;
	
	@Column(name = "image_url", nullable = false, length = 100)
	private String imageUrl;
	
	public Menu(){
		
	}

	public Menu(Long id, String name, String description, BigDecimal priceMenu, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.priceMenu = priceMenu;
		this.imageUrl = imageUrl;
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

	public BigDecimal getPriceMenu() {
		return priceMenu;
	}

	public void setPriceMenu(BigDecimal priceMenu) {
		this.priceMenu = priceMenu;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", priceMenu=");
		builder.append(priceMenu);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append("]");
		return builder.toString();
	}
	
	
}
