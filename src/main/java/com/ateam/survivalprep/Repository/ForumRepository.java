package com.ateam.survivalprep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.ForumEntity;

@Repository
public interface ForumRepository extends JpaRepository<ForumEntity,Integer>{
	
}