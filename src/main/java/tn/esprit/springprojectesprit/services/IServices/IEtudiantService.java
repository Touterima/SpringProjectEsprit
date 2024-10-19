package tn.esprit.springprojectesprit.services.IServices;

import tn.esprit.springprojectesprit.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
     Etudiant addEtudiant(Etudiant etudiant);
     Etudiant updateEtudiant(Etudiant etudiant);
     List<Etudiant> retrieveAllEtudiant();
     Etudiant retrieveEtudiantById(Long idE);
     void deleteEtudiantById(Long idE);
}
