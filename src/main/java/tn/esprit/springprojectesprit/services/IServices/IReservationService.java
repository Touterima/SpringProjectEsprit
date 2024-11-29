package tn.esprit.springprojectesprit.services.IServices;

import tn.esprit.springprojectesprit.entities.Chambre;
import tn.esprit.springprojectesprit.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    List<Reservation> retrieveAllReservation();
    Reservation retrieveReservationById(Long idR);
    void deleteReservationById(Long idR);

    Long getReservationParAnneeUniversitaire(LocalDate date1, LocalDate date2);
    void mettreAJourEtAfficherReservations();

}
