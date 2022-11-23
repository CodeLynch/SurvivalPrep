package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.PostEntity;
import com.ateam.survivalprep.Entity.ThreadEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Integer>{
    public List<PostEntity> findByIsdeleted (boolean isdeleted);
    public List<PostEntity> findAllByIsdeletedAndCreatorUserid (boolean isdeleted, int userid);
    public List<PostEntity> findAllByIsdeletedAndThreadThreadid(boolean isdeleted, int threadid);
    public List<PostEntity> findByThread (ThreadEntity thread);
}