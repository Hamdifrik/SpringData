package com.springdata.first.service;


import com.springdata.first.model.Dto.GestionnaireCDto;
import com.springdata.first.model.Entity.GestionnaireC;
import com.springdata.first.repository.GestCRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestCService {


    @Autowired
    private GestCRepo gestrepo;

public GestionnaireCDto getgest(Integer id){
    Optional<GestionnaireC> gestC=this.gestrepo.findById(id);
    if ( gestC.isPresent())
        return GestionnaireCDto.toDto(gestC.get());
    else
        return null;
}
public GestionnaireCDto savegestC(GestionnaireCDto gestC){
    return  GestionnaireCDto.toDto(gestrepo.save(GestionnaireC.toEntity(gestC)));
}

public void deleteGest(Integer id){
    this.gestrepo.deleteById(id);
}

public List<GestionnaireC> getAll(){
    return this.gestrepo.findAll();
}



}
