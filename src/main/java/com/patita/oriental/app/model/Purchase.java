package com.patita.oriental.app.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	@OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PurchaseMenu> purchaseMenus = new ArrayList<>();
	
	public Purchase(){
		
	}

	public Purchase(Long id, LocalDateTime orderDate, BigDecimal finalAmount, User user, List<PurchaseMenu> purchaseMenus) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.finalAmount = finalAmount;
		this.user = user;
		this.purchaseMenus = purchaseMenus;
	}

	public List<PurchaseMenu> getPurchaseMenus() {
		return purchaseMenus;
	}

	public void setPurchaseMenus(List<PurchaseMenu> purchaseMenus) {
		this.purchaseMenus = purchaseMenus;
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
