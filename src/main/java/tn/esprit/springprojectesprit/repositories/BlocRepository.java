package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
