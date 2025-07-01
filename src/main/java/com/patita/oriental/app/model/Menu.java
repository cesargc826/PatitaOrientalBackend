package com.patita.oriental.app.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 45)
	private String name;
	
	@Column(name = "description", nullable = false, length = 250)
	private String description;
	
	@Column(name = "price_menu", nullable = false, precision = 10, scale = 2)
	private BigDecimal priceMenu;
	
	@Column(name = "image_url", nullable = false, length = 100)
	private String imageUrl;
	
	@OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<PurchaseMenu> purchaseMenus = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( 
			name="menu_has_products", 
			joinColumns = @JoinColumn(name = "id_menu"),
			inverseJoinColumns = @JoinColumn(name = "id_product")
			)
	private Set<Product> products = new HashSet<>();
	
	public Menu(){
		
	}

	public Menu(Long id, String name, String description, BigDecimal priceMenu, String imageUrl, 
			List<PurchaseMenu> purchaseMenus, Set<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.priceMenu = priceMenu;
		this.imageUrl = imageUrl;
		this.purchaseMenus = purchaseMenus;
		this.products = products;
	}
	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public List<PurchaseMenu> getPurchaseMenus() {
		return purchaseMenus;
	}

	public void setPurchaseMenus(List<PurchaseMenu> purchaseMenus) {
		this.purchaseMenus = purchaseMenus;
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
