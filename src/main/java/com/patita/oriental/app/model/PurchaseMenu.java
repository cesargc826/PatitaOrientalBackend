package com.patita.oriental.app.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "purchases_has_products")
public class PurchaseMenu {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_purchase", nullable = false)
    private Purchase purchase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_menu", nullable = false)
    private Menu menu;
    
    @Column(nullable = false)
    private int quantity;
    
    @Column(name = "unit_price", nullable = false, precision = 10, scale = 2)
	private BigDecimal unitPrice;
    
    @Column(name = "price_shipping", nullable = false, precision = 10, scale = 2)
	private BigDecimal priceShipping;
}
