package com.springdata.first.repository;


import com.springdata.first.model.Entity.GestionnaireS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestSRepo extends JpaRepository<GestionnaireS,Integer> {
}
