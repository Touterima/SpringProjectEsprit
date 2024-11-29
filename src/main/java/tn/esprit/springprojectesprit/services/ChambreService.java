package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.entities.Chambre;
import tn.esprit.springprojectesprit.enums.TypeChambre;
import tn.esprit.springprojectesprit.repositories.ChambreRepository;
import tn.esprit.springprojectesprit.services.IServices.IChambreService;

import java.util.List;

@Service
@RequiredArgsConstructor

@Slf4j
public class ChambreService implements IChambreService {
    private final ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }



    @Scheduled(cron="0 * * * * *")
    public List<Chambre> retrieveAllChambre() {
        List<Chambre> listC = chambreRepository.findAll();
        log.info("taille chambres : " + listC.size());
        for(Chambre c:listC){
            log.info("Chambre : "+c);
            //log.info(c.toString());
        }
        return listC;
    }

    @Override
    public Chambre retrieveChambreById(Long idC) {
        return chambreRepository.findById(idC).orElse(null);
    }

    @Override
    public void deleteChambreById(Long idC) {
        chambreRepository.deleteById(idC);
    }

    @Override
    public List<Chambre> getChambreByType(TypeChambre typeChambre){
        return chambreRepository.getChambreByType(typeChambre);
    }

    @Override
    public List<Chambre> getChambreByBlocAndType(Long idB, TypeChambre typeChambre){
        return chambreRepository.findByBloc_IdBAndTypeC(idB, typeChambre);
        //return chambreRepository.getChambreByBlocEtType(idB, typeChambre);
    }
}
