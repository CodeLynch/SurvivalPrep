package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Integer>{
    public PostEntity findByPostid (int postid);
    public List<PostEntity> findByIsdeleted (boolean isdeleted);
    public List<PostEntity> findAllByIsdeletedAndCreatorUserid (boolean isdeleted, int userid);
    public List<PostEntity> findAllByIsdeletedAndThreadThreadid(boolean isdeleted, int threadid);
}