package com.MiniProjet.backend.BackendApplication.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
   @Id
   @GeneratedValue
    private Long id;
    private String description;
    private double price;
    private int quantity;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
}
