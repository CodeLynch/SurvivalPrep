package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.FamilyInviteEntity;

@Repository
public interface FamilyInviteRepository extends JpaRepository<FamilyInviteEntity, Integer>{
    public List<FamilyInviteEntity> findByIsdeleted (boolean isdeleted);
    public List<FamilyInviteEntity> findAllByInviteeUseridAndIsdeleted(int userid, boolean isdeleted);
    public List<FamilyInviteEntity> findAllByInviterUserid(int userid);
    
}
