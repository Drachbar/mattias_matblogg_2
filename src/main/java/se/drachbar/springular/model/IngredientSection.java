package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_ingredient_section")
public class IngredientSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredientSection;
    @ManyToOne
    @JoinColumn(name = "id_recepie")
    private Recepie idRecepie;
    private String name;
    private Integer sectionOrder;
}
