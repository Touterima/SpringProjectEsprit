package tn.esprit.springprojectesprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import tn.esprit.springprojectesprit.entities.Reservation;
import tn.esprit.springprojectesprit.services.ReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReservationCntroller {
    private final ReservationService reservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }
    @PutMapping("/updateReservation")
    public Reservation updateFoyer(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }
    @GetMapping("/getAllReservation")
    public List<Reservation> retrieveAllReservation() {
        return reservationService.retrieveAllReservation();
    }
    @GetMapping("/findReservationById/{idR}")
    public Reservation retrieveReservationById(@PathVariable Long idR) {
        return reservationService.retrieveReservationById(idR);
    }
    @DeleteMapping("deleteReservationById/{idR}")
    public void deleteReservationById(@PathVariable Long idR) {
        reservationService.deleteReservationById(idR);
    }

    @GetMapping("findReservation/{date1}/{date2}")
    public Long getReservationParAnneeUniversitaire(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDate date1, @PathVariable LocalDate date2){
        return reservationService.getReservationParAnneeUniversitaire(date1, date2);
    }
    @GetMapping("schedule")
    public void mettreAJourEtAfficherReservations(){
        reservationService.mettreAJourEtAfficherReservations();
    }
}
