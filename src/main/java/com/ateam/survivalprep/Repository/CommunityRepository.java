package com.ateam.survivalprep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.CommunityEntity;

@Repository
public interface CommunityRepository extends JpaRepository<CommunityEntity, Integer>{
    
}
