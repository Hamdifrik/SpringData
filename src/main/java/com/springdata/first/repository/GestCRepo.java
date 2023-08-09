package com.springdata.first.repository;

import com.springdata.first.model.Entity.GestionnaireC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestCRepo extends JpaRepository<GestionnaireC,Integer> {
}
