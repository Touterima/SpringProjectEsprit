package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Foyer;
import tn.esprit.springprojectesprit.repositories.FoyerRepository;
import tn.esprit.springprojectesprit.services.IServices.IFoyerService;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class FoyerService implements IFoyerService {
    private final FoyerRepository foyerRepository ;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> retrieveAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyerById(Long idF) {
        return foyerRepository.findById(idF).orElse(null);
    }

    @Override
    public void deleteFoyerById(Long idF) {
        foyerRepository.deleteById(idF);
    }
}
