package com.patita.oriental.app.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchases")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "order_date", nullable = false)
	private LocalDateTime orderDate;
	
	@Column(name = "final_amount", nullable = false, precision = 10, scale = 2)
	private BigDecimal finalAmount;
	
	public Purchase(){
		
	}

	public Purchase(Long id, LocalDateTime orderDate, BigDecimal finalAmount) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.finalAmount = finalAmount;
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
