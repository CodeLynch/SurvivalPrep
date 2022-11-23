package com.ateam.survivalprep.Entity;

//import java.util.Set;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @ManyToOne(targetEntity = UserEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "userid")
    private UserEntity creator;

    @ManyToOne(targetEntity = CommunityEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "communityid")
    private CommunityEntity community;

    private boolean isdeleted;

    public ForumEntity(){}
    
    
    public ForumEntity(int forumid, String forumtitle, String forumdesc, LocalDateTime datetimecreated,
            UserEntity creator, CommunityEntity community, boolean isdeleted) {
        this.forumid = forumid;
        this.forumtitle = forumtitle;
        this.forumdesc = forumdesc;
        this.datetimecreated = datetimecreated;
        this.creator = creator;
        this.community = community;
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
    
    public UserEntity getCreator() {
        return creator;
    }


    public void setCreator(UserEntity creator) {
        this.creator = creator;
    }

    public CommunityEntity getCommunity() {
        return community;
    }

    public boolean isdeleted() {
        return isdeleted;
    }
    public void setDeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
