package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ateam.survivalprep.Entity.ThreadEntity;

@Repository
public interface ThreadRepository extends JpaRepository<ThreadEntity, Integer>{
	public ThreadEntity findByThreadtitle (String threadtitle);

    public List<ThreadEntity> findAllByForum (int forumid);
    public List<ThreadEntity> findByIsdeleted (boolean isdeleted);

}