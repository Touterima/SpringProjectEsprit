package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
