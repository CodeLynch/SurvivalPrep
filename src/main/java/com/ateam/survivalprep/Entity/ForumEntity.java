package com.ateam.survivalprep.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_forum")
public class ForumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int forumid;
    private String forumtitle;
    private String forumdesc;
    private LocalDateTime datetimecreated = java.time.LocalDateTime.now();
    // private Set<UserEntity> creator;
    private boolean isdeleted;

    public ForumEntity(){}
    
    public ForumEntity(int forumid, String forumtitle, String forumdesc, boolean isdeleted) {
        this.forumid = forumid;
        this.forumtitle = forumtitle;
        this.forumdesc = forumdesc;
        this.isdeleted = isdeleted;
    }
    public int getForumid() {
        return forumid;
    }

    public String getForumtitle() {
        return forumtitle;
    }
    public void setForumtitle(String forumtitle) {
        this.forumtitle = forumtitle;
    }

    public String getForumdesc() {
        return forumdesc;
    }
    public void setForumdesc(String forumdesc) {
        this.forumdesc = forumdesc;
    }

    public LocalDateTime getDatetimecreated() {
        return datetimecreated;
    }
    
    public boolean isdeleted() {
        return isdeleted;
    }
    public void setDeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
    
}
