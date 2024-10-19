package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Reservation;
import tn.esprit.springprojectesprit.repositories.ReservationRepository;
import tn.esprit.springprojectesprit.services.IServices.IReservationService;

import java.util.List;

@Service
@RequiredArgsConstructor
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

}
