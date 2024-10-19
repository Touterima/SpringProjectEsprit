package tn.esprit.springprojectesprit.services.IServices;

import tn.esprit.springprojectesprit.entities.Foyer;

import java.util.List;

public interface IFoyerService {
     Foyer addFoyer(Foyer foyer);
     Foyer updateFoyer(Foyer foyer);
     List<Foyer> retrieveAllFoyer();
     Foyer retrieveFoyerById(Long idF);
     void deleteFoyerById(Long idF);
}
