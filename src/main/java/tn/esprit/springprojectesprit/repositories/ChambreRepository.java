package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
