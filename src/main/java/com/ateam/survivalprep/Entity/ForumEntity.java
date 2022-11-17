package com.ateam.survivalprep.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ForumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int forum_id;
    private String forumTitle;
    private String forumDesc;
    private LocalDateTime dateTimeCreated = java.time.LocalDateTime.now();
    // private Set<UserEntity> creator;
    private boolean isDeleted;

    public ForumEntity(){}
    
    public ForumEntity(int forum_id, String forumTitle, String forumDesc, boolean isDeleted) {
        this.forum_id = forum_id;
        this.forumTitle = forumTitle;
        this.forumDesc = forumDesc;
        this.isDeleted = isDeleted;
    }
    public int getForum_id() {
        return forum_id;
    }

    public String getForumTitle() {
        return forumTitle;
    }
    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle;
    }

    public String getForumDesc() {
        return forumDesc;
    }
    public void setForumDesc(String forumDesc) {
        this.forumDesc = forumDesc;
    }

    public LocalDateTime getDateTimeCreated() {
        return dateTimeCreated;
    }
    
    public boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
}
