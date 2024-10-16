package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
