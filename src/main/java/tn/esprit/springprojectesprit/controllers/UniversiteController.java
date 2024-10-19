package tn.esprit.springprojectesprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tn.esprit.springprojectesprit.entities.Universite;
import tn.esprit.springprojectesprit.services.IServices.IUniversiteService;
import tn.esprit.springprojectesprit.services.UniversiteService;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UniversiteController {
    private final UniversiteService universiteService;

    private final IUniversiteService iUniversiteService;
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return iUniversiteService.addUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return iUniversiteService.updateUniversite(universite);
    }
    @GetMapping("/getAllUniversite")
    public List<Universite> retrieveAllUniversite() {
        return iUniversiteService.retrieveAllUniversite();
    }
    @GetMapping("/findUniversiteById/{idU}")
    public Universite retrieveUniversiteById(@PathVariable Long idU) {
        return iUniversiteService.retrieveUniversiteById(idU);
    }
    @DeleteMapping("deleteUniversiteById/{idU}")
    public void deleteUniversiteById(@PathVariable Long idU) {
        iUniversiteService.deleteUniversiteById(idU);
    }

    @PostMapping("/affecterFoyerAUniversite/{idF}/{idU}")
    public Universite affecterFoyerAUniversite(@PathVariable Long idF,@PathVariable Long idU) {
        return universiteService.affecterFoyerAUniversite(idF, idU);
    }
}
