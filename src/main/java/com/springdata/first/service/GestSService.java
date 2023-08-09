package com.springdata.first.service;


import com.springdata.first.model.Dto.GestionnaireSDto;
import com.springdata.first.model.Entity.GestionnaireS;
import com.springdata.first.repository.GestSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestSService {


    @Autowired
    private GestSRepo gestrepo;

    public GestionnaireSDto getgest(Integer id){
        Optional<GestionnaireS> gestC=this.gestrepo.findById(id);
        if ( gestC.isPresent())
            return GestionnaireSDto.toDto(gestC.get());
        else
            return null;
    }

    public GestionnaireSDto savegestS(GestionnaireSDto gestS){
        return  GestionnaireSDto.toDto(gestrepo.save(GestionnaireS.toEntity(gestS)));
    }

    public void deleteGest(Integer id){
        this.gestrepo.deleteById(id);
    }

    public List<GestionnaireS> getAll(){
        return this.gestrepo.findAll();
    }



}
