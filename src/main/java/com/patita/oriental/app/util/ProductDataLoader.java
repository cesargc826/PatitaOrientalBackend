package com.patita.oriental.app.util;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.patita.oriental.app.model.Category;
import com.patita.oriental.app.model.Product;
import com.patita.oriental.app.reposity.CategoryRepository;
import com.patita.oriental.app.reposity.ProductRepository;

@Component
public class ProductDataLoader implements CommandLineRunner{
	@Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

	@Override
	@Order(3)
	public void run(String... args) throws Exception {
		if (productRepository.count() == 0) {
            Category comida = categoryRepository.findByName("Comida").orElseThrow();
            Category bebida = categoryRepository.findByName("Bebida").orElseThrow();
            Category postre = categoryRepository.findByName("Postre").orElseThrow();

            LocalDateTime now = LocalDateTime.now();

            List<Product> products = List.of(
                new Product(null, "Ramen", "Fideos instantáneos de diferentes sabores. Los toppings son por separado.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54582388941_d037fddcda_z.jpg", true, comida, now, now),

                new Product(null, "Dumplings", "Empanadas de pollo con verduras acompañadas con salsa de soya. Incluye 6 piezas.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54557082555_f7701e1e3a_b.jpg", true, comida, now, now),

                new Product(null, "Gyozas", "Empanadas de carne con verduras. Incluye 6 piezas.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54556985238_864e8c681a_b.jpg", true, comida, now, now),

                new Product(null, "Takoyaki de Queso", "Comida japonesa en forma de bolita rellena de queso. Incluye 8 piezas.",
                        new BigDecimal("50"), "https://live.staticflickr.com/65535/54557082565_90bf8bc258_b.jpg", true, comida, now, now),

                new Product(null, "Takoyaki de Cámaron", "Comida japonesa en forma de bolita rellena de camarón. Incluye 8 piezas.",
                        new BigDecimal("55"), "https://live.staticflickr.com/65535/54557082565_90bf8bc258_b.jpg", true, comida, now, now),

                new Product(null, "Mini Wonton's", "Mini empanaditas de pollo con cilantro, acompañadas de sopa picosa. Incluye 7 piezas.",
                        new BigDecimal("40"), "https://live.staticflickr.com/65535/54556931139_38462b55f0_b.jpg", true, comida, now, now),

                new Product(null, "Bubble Tea frapeado de oreo", "Bebida sabor galleta oreo con tapioca.",
                        new BigDecimal("70"), "https://live.staticflickr.com/65535/54556985183_7305512154_b.jpg", true, bebida, now, now),

                new Product(null, "Bubble Tea frapeado de Taro", "Bebida sabor taro con tapioca.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54556931024_72fd257082_b.jpg", true, bebida, now, now),

                new Product(null, "Bubble Tea frapeado de Matcha", "Bebida sabor matcha con tapioca.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54555862627_0ce40d4934_b.jpg", true, bebida, now, now),

                new Product(null, "Bubble Tea líquido de Taro", "Bebida sabor taro con tapioca (versión líquida).",
                        new BigDecimal("60"), "https://live.staticflickr.com/65535/54557159910_2c3ee8cede_b.jpg", true, bebida, now, now),

                new Product(null, "Bubble Tea líquido de Matcha", "Bebida sabor matcha con tapioca (versión líquida).",
                        new BigDecimal("60"), "https://live.staticflickr.com/65535/54557007719_e1b321b76a_b.jpg", true, bebida, now, now),

                new Product(null, "Soda Italiana sabor Fresa", "Bebida gaseosa sabor fresa con perlas explosivas del mismo sabor.",
                        new BigDecimal("50"), "https://live.staticflickr.com/65535/54557082485_e4ca34edeb_b.jpg", true, bebida, now, now),

                new Product(null, "Soda Italiana sabor Mora Azul", "Bebida gaseosa sabor mora azul con perlas explosivas del mismo sabor.",
                        new BigDecimal("50"), "https://live.staticflickr.com/65535/54556931029_ae8d7a705b_b.jpg", true, bebida, now, now),

                new Product(null, "Soda Italiana sabor Mango", "Bebida gaseosa sabor mango con perlas explosivas del mismo sabor.",
                        new BigDecimal("50"), "https://live.staticflickr.com/65535/54556985153_0099b96e1e_b.jpg", true, bebida, now, now),

                new Product(null, "Calpis", "Bebida japonesa con sabor parecido a la leche con un toque ácido.",
                        new BigDecimal("30"), "https://live.staticflickr.com/65535/54556743576_51f4d2e89a_b.jpg", true, bebida, now, now),

                new Product(null, "Paleta Ternurin", "Paleta de fresas con crema con forma de ternurines diferentes.",
                        new BigDecimal("30"), "https://live.staticflickr.com/65535/54556743811_55fd1014a2_b.jpg", true, postre, now, now),

                new Product(null, "Galleta Ternurin", "Galleta artesanal decorada con diseños de ternurines.",
                        new BigDecimal("25"), "https://live.staticflickr.com/65535/54556826716_911356c52d_b.jpg", true, postre, now, now),

                new Product(null, "Taiyaki con Mermelada y Philadelphia", "Pastelito japonés en forma de pez relleno de mermelada y queso Philadelphia. Incluye 2 piezas.",
                        new BigDecimal("60"), "https://live.staticflickr.com/65535/54557082665_4bcf762f78_b.jpg", true, postre, now, now),

                new Product(null, "Taiyaki con Nutella", "Pastelito japonés en forma de pez relleno de Nutella. Incluye 2 piezas.",
                        new BigDecimal("60"), "https://live.staticflickr.com/65535/54557082665_4bcf762f78_b.jpg", true, postre, now, now),

                new Product(null, "Taiyaki con Crema Pastelera", "Pastelito japonés en forma de pez relleno de crema pastelera. Incluye 2 piezas.",
                        new BigDecimal("60"), "https://live.staticflickr.com/65535/54557082665_4bcf762f78_b.jpg", true, postre, now, now),

                new Product(null, "Taiyaki con Jamón y queso", "Pastelito japonés en forma de pez relleno de jamón y queso. Incluye 2 piezas.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54557082665_4bcf762f78_b.jpg", true, postre, now, now),

                new Product(null, "Taiyaki con Pepperoni y queso", "Pastelito japonés en forma de pez relleno de pepperoni y queso. Incluye 2 piezas.",
                        new BigDecimal("65"), "https://live.staticflickr.com/65535/54557082665_4bcf762f78_b.jpg", true, postre, now, now)
            );

            productRepository.saveAll(products);
            System.out.println("Productos insertados correctamente.");
        } else {
            System.out.println("Ya existen productos. No se insertaron duplicados.");
        }
		
	}

}
