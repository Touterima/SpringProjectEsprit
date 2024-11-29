package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Reservation;
import tn.esprit.springprojectesprit.repositories.ReservationRepository;
import tn.esprit.springprojectesprit.services.IServices.IReservationService;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationService implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservationById(Long idR) {
        return reservationRepository.findById(idR).orElse(null);
    }

    @Override
    public void deleteReservationById(Long idR) {
        reservationRepository.deleteById(idR);
    }

    @Override
    public Long getReservationParAnneeUniversitaire(LocalDate date1, LocalDate date2){
        return reservationRepository.countByDateDebutBetween(date1,date2);
    }

    @Scheduled(fixedRate = 50000) // Exécution périodique toutes les 50 secondes
    public void mettreAJourEtAfficherReservations() {
        LocalDate dateLimite = LocalDate.of(2024, 1, 1);

        // Trouver toutes les réservations avant le 01/01/2024
        List<Reservation> reservations = reservationRepository.findAllByDateDebutBefore(dateLimite);

        // Mise à jour de l'état des réservations à false
        for (Reservation reservation : reservations) {
            reservation.setEstValide(false);
            reservationRepository.save(reservation);
        }

        // Affichage des réservations mises à jour
        log.info("==> Liste des réservations mises à jour :");
        reservationRepository.findAll().forEach(reservation -> log.info(reservation.toString()));
    }
}
