package tn.esprit.springprojectesprit.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.repositories.BlocRepository;
import tn.esprit.springprojectesprit.services.IServices.IBlocService;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class BlocService implements IBlocService {
    private final BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBlocById(Long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBlocById(Long idB) {
        blocRepository.deleteById(idB);
    }
}
