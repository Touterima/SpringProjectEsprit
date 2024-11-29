package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    public List<Bloc> findByCapaciteB(Long capaciteB);
}
