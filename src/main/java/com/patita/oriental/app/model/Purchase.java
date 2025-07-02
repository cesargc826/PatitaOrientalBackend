package com.patita.oriental.app.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "purchases")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_purchase")
	private Long id;
	
	@Column(name = "order_date", nullable = false)
	private LocalDateTime orderDate;
	
	@Column(name = "final_amount", nullable = false, precision = 10, scale = 2)
	private BigDecimal finalAmount;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_user")
	private User user;
	
	//=============== Relacion muachos a muchos para crear la tabla Favoritos ==================================
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( 
			name="purchases_has_products", 
			joinColumns = @JoinColumn(name = "id_purchase"),
			inverseJoinColumns = @JoinColumn(name = "id_product")
			)
	private Set<Product> purchaseProducts = new HashSet<>();
	
	
	public Purchase(){
		
	}

	public Purchase(Long id, LocalDateTime orderDate, BigDecimal finalAmount, User user, Set<Product> purchaseProducts) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.finalAmount = finalAmount;
		this.user = user;
		this.purchaseProducts = purchaseProducts;
	}
	
	public Set<Product> getPurchaseProducts() {
		return purchaseProducts;
	}

	public void setPurchaseProducts(Set<Product> purchaseProducts) {
		this.purchaseProducts = purchaseProducts;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Purchase [id=");
		builder.append(id);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", finalAmount=");
		builder.append(finalAmount);
		builder.append("]");
		return builder.toString();
	}
	
	
}
