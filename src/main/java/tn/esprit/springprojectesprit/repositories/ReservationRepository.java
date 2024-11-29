package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectesprit.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    public Long countByDateDebutBetween(LocalDate date1, LocalDate date2);
    public List<Reservation> findAllByDateDebutBefore(LocalDate dateLimite);
}
