package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    UserEntity findByUserid(int id);
    UserEntity findByEmail(String email);
    List<UserEntity> findByIsdeleted(boolean is_deleted);
    List<UserEntity> findAllByIsdeletedAndFamilyFamilyid (boolean is_deleted, int familyid);
    UserEntity findByContactno(String contact_no);
    
}
