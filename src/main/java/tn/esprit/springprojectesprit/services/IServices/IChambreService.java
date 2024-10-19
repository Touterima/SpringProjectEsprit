package tn.esprit.springprojectesprit.services.IServices;

import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.entities.Chambre;

import java.util.List;

public interface IChambreService {

    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    List<Chambre> retrieveAllChambre();
    Chambre retrieveChambreById(Long idC);
    void deleteChambreById(Long idC);
}


