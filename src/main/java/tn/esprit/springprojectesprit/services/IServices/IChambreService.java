package tn.esprit.springprojectesprit.services.IServices;

import org.springframework.data.repository.query.Param;
import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.entities.Chambre;
import tn.esprit.springprojectesprit.enums.TypeChambre;

import java.util.List;

public interface IChambreService {

    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    List<Chambre> retrieveAllChambre();
    Chambre retrieveChambreById(Long idC);
    void deleteChambreById(Long idC);

    List<Chambre> getChambreByType(TypeChambre typeChambre);
    List<Chambre> getChambreByBlocAndType(Long idB, TypeChambre typeChambre);
}


