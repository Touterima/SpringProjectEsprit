package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
