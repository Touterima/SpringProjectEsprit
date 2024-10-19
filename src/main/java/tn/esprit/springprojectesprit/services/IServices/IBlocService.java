package tn.esprit.springprojectesprit.services.IServices;

import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.entities.Foyer;

import java.util.List;

public interface IBlocService {
     Bloc addBloc(Bloc bloc);
     Bloc updateBloc(Bloc bloc);
     List<Bloc> retrieveAllBloc();
     Bloc retrieveBlocById(Long idB);
     void deleteBlocById(Long idB);
}
