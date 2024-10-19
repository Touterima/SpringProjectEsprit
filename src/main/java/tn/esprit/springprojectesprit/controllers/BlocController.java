package tn.esprit.springprojectesprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprojectesprit.entities.Bloc;
import tn.esprit.springprojectesprit.services.IServices.IBlocService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlocController {
    private IBlocService iBlocService;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return iBlocService.addBloc(bloc);
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return iBlocService.updateBloc(bloc);
    }
    @GetMapping("/getAllBloc")
    public List<Bloc> retrieveAllBloc() {
        return iBlocService.retrieveAllBloc();
    }
    @GetMapping("/findBlocById/{idB}")
    public Bloc retrieveBlocById(@PathVariable Long idB) {
        return iBlocService.retrieveBlocById(idB);
    }
    @DeleteMapping("deleteBlocById/{idB}")
    public void deleteBlocById(@PathVariable Long idB) {
        iBlocService.deleteBlocById(idB);
    }
}
