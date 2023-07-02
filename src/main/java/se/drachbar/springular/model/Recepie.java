package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_recepie")
public class Recepie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecepie;
    private String nameRecepie;
    private String description;
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creatorId;

}
