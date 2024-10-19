package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Foyer;
import tn.esprit.springprojectesprit.entities.Universite;
import tn.esprit.springprojectesprit.repositories.FoyerRepository;
import tn.esprit.springprojectesprit.repositories.UniversiteRepository;
import tn.esprit.springprojectesprit.services.IServices.IUniversiteService;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class UniversiteService implements IUniversiteService {
    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversiteById(Long idU) {
        return universiteRepository.findById(idU).orElse(null);
    }

    @Override
    public void deleteUniversiteById(Long idU) {
        universiteRepository.deleteById(idU);
    }

    public Universite affecterFoyerAUniversite(Long idF, Long idU){
        Universite universite= universiteRepository.findById(idU).orElse(null);
        Foyer foyer= foyerRepository.findById(idF).orElse(null);

        universite.setFoyer(foyer);

        return universiteRepository.save(universite);
    }
}
