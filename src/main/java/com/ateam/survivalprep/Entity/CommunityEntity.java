package com.ateam.survivalprep.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Entity
@Table(name = "tbl_community")
public class CommunityEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int communityid;
    private String communityname;
    private String address;

    @ManyToOne(targetEntity = UserEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "userid")
    private UserEntity creator;


    private boolean isdeleted;

    public CommunityEntity(){}

    public CommunityEntity(int communityid, String communityname, String address, UserEntity creator, boolean isdeleted) {
        this.communityid = communityid;
        this.communityname = communityname;
        this.address = address;
        this.creator = creator;
        this.isdeleted = isdeleted;
    }

    public int getCommunityid() {
        return communityid;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonBackReference
    public UserEntity getCreator() {
        return creator;
    }

    public boolean isdeleted() {
        return isdeleted;
    }

    public void setDeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
