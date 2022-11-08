package com.ateam.survivalprep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.FamilyEntity;

@Repository
public interface FamilyRepository extends JpaRepository<FamilyEntity, Integer>{
    
}
