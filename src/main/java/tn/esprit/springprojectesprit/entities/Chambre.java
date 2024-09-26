package tn.esprit.springprojectesprit.entities;

import jakarta.persistence.*;
import tn.esprit.springprojectesprit.enums.TypeChambre;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numC;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
