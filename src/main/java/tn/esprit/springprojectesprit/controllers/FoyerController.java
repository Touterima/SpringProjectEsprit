package tn.esprit.springprojectesprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.entities.Foyer;
import tn.esprit.springprojectesprit.services.FoyerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FoyerController {
    private final FoyerService foyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }
    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }
    @GetMapping("/getAllFoyer")
    public List<Foyer> retrieveAllFoyer() {
        return foyerService.retrieveAllFoyer();
    }
    @GetMapping("/findFoyerById/{idF}")
    public Foyer retrieveFoyerById(@PathVariable Long idF) {
        return foyerService.retrieveFoyerById(idF);
    }
    @DeleteMapping("deleteFoyerById/{idF}")
    public void deleteFoyerById(@PathVariable Long idF) {
        foyerService.deleteFoyerById(idF);
    }
}
