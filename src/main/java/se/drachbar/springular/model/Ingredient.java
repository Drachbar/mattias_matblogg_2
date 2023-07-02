package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredient;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_section")
    private IngredientSection idSection;
    private Integer ingredientOrder;
    private String unit;
    private double amount;
}
