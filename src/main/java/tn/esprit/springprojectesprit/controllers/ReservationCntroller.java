package tn.esprit.springprojectesprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.springprojectesprit.entities.Reservation;
import tn.esprit.springprojectesprit.services.ReservationService;

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
}
