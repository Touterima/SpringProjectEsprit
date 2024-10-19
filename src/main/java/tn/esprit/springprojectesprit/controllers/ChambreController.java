package tn.esprit.springprojectesprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprojectesprit.entities.Chambre;
import tn.esprit.springprojectesprit.services.ChambreService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChambreController {
    private final ChambreService chambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {

        return chambreService.addChambre(chambre);
    }
    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {

        return chambreService.updateChambre(chambre);
    }
    @GetMapping("/getAllChambre")
    public List<Chambre> retrieveAllChambre() {
        return chambreService.retrieveAllChambre();
    }
    @GetMapping("/findChambreById/{idC}")
    public Chambre retrieveChambreById(@PathVariable Long idC) {
        return chambreService.retrieveChambreById(idC);
    }
    @DeleteMapping("deleteChambreById/{idC}")
    public void deleteChambreById(@PathVariable Long idC) {
        chambreService.deleteChambreById(idC);
    }

}
