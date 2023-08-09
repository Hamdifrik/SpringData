package com.springdata.first.controller;

import com.springdata.first.model.Dto.GestionnaireSDto;
import com.springdata.first.model.Entity.GestionnaireS;
import com.springdata.first.service.GestSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestionnairess")
public class GestionnaireSController {
    private final GestSService gestservice;

    @Autowired
    public GestionnaireSController(GestSService gestservice) {
        this.gestservice = gestservice;

    }
    @GetMapping("/get-gestionnaireS")
    public GestionnaireSDto getGest (@RequestParam Integer id){
        return gestservice.getgest(id);
    }

    @PostMapping("/save-gestionnaireS")
    public GestionnaireSDto saveGEst (@RequestBody GestionnaireSDto gestS ){
        return  gestservice.savegestS(gestS);
    }

    @DeleteMapping("/delete-gestionnaireS")
    public void delete (@RequestParam Integer id ){
        this.gestservice.deleteGest(id);
    }

    @GetMapping("get-all")
    public List<GestionnaireS> getAll(){
        return this.gestservice.getAll();
    }




}
