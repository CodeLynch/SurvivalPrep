package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.ForumEntity;

@Repository
public interface ForumRepository extends JpaRepository<ForumEntity, Integer> {
    public ForumEntity findByForumtitle (String forumtitle);
    public ForumEntity findByForumid (int forumid);
    public List<ForumEntity> findAllByCommunityCommunityidAndIsdeleted(int communityId, boolean isDeleted);
    public List<ForumEntity> findByIsdeleted (boolean isdeleted);
}
