package tn.esprit.springprojectesprit.services.IServices;

import tn.esprit.springprojectesprit.entities.Universite;
import tn.esprit.springprojectesprit.repositories.UniversiteRepository;

import java.util.List;

public interface IUniversiteService {
     Universite addUniversite(Universite universite);
     Universite updateUniversite(Universite universite);
     List<Universite> retrieveAllUniversite();
     Universite retrieveUniversiteById(Long idU);
     void deleteUniversiteById(Long idU);

    Universite affecterFoyerAUniversite(Long idF, Long IdU);
}
