package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.PostEntity;
import com.ateam.survivalprep.Entity.ThreadEntity;
import com.ateam.survivalprep.Entity.UserEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Integer>{
    public List<PostEntity> findByIsdeleted (boolean isdeleted);
    // public List<PostEntity> findbyUserid (UserEntity user);
    public List<PostEntity> findByThread (ThreadEntity thread);
}