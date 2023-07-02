package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_recepie_step")
public class RecepieStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecepieStep;
    @ManyToOne
    @JoinColumn(name = "id_recepie")
    private Recepie idRecepie;
    private String description;
    private Integer stepOrder;
}
