package tn.esprit.springprojectesprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springprojectesprit.entities.Chambre;
import tn.esprit.springprojectesprit.enums.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("select c from Chambre c where c.typeC=:typeChambre")
    public List<Chambre> getChambreByType(@Param("typeChambre") TypeChambre typeChambre);

    //avec keyWord
    public List<Chambre> findByBloc_IdBAndTypeC(Long idB, TypeChambre typeChambre);

    //avec JPQL : Jakarta Persisting Query Language
    @Query("select c from Chambre c where c.bloc.idB=:idB and c.typeC=:typeChambre"  )
    public List<Chambre> getChambreByBlocEtType(@Param("idB")Long idB, @Param("typeChambre") TypeChambre typeChambre);


}

