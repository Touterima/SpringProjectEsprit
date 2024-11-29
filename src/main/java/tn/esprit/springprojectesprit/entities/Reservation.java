package tn.esprit.springprojectesprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;

    @Temporal(TemporalType.DATE)
    private Date anneeU;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Boolean estValide;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;



}
