package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Etudiant;
import tn.esprit.springprojectesprit.repositories.EtudiantRepository;
import tn.esprit.springprojectesprit.services.IServices.IEtudiantService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EtudiantService implements IEtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiantById(Long idE) {
        return etudiantRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteEtudiantById(Long idE) {
        etudiantRepository.deleteById(idE);
    }

}
