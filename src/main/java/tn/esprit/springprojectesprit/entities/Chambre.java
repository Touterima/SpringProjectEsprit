package tn.esprit.springprojectesprit.entities;

import jakarta.persistence.*;
import tn.esprit.springprojectesprit.enums.TypeChambre;

import java.io.Serializable;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numC;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
