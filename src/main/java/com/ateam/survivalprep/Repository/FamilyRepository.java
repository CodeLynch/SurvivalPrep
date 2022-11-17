package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.FamilyEntity;

@Repository
public interface FamilyRepository extends JpaRepository<FamilyEntity, Integer>{
    public FamilyEntity findByInvitecode(String code);
    public List<FamilyEntity>findByIsdeleted(boolean isDeleted);
}
