package com.springdata.first.controller;

import com.springdata.first.model.Dto.GestionnaireCDto;
import com.springdata.first.model.Entity.GestionnaireC;
import com.springdata.first.service.GestCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestionnairecs")
public class GestionnaireCController {
    private final GestCService gestservice;

    @Autowired
    public GestionnaireCController(GestCService gestservice) {
        this.gestservice = gestservice;

    }
    @GetMapping("/get-gestionnaireC")
    public GestionnaireCDto getGest (@RequestParam Integer id){
        return gestservice.getgest(id);
    }

    @PostMapping("/save-gestionnaireC")
    public GestionnaireCDto saveGEst (@RequestBody GestionnaireCDto gestC ){
        return  gestservice.savegestC(gestC);
    }

    @DeleteMapping("/delete-gestionnaireC")
    public void delete (@RequestParam Integer id ){
        this.gestservice.deleteGest(id);
}

 @GetMapping("get-all")
  public List<GestionnaireC> getAll(){
        return this.gestservice.getAll();
}




}
