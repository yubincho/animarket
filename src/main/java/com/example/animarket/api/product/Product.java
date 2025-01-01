package com.example.animarket.api.product;

import com.example.animarket.api.category.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@EqualsAndHashCode
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private int inventory;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    /** *************************************************/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    /** *************************************************/

    @Builder
    public Product(String name, String description, String brand,
                   BigDecimal price, int inventory, ProductStatus status) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.inventory = inventory;
        this.status = status;
    }


}
