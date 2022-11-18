package com.ateam.survivalprep.Entity;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_community")
public class CommunityEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int communityid;
    private String communityName;
    private String address;

    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "userid")
    private Set<UserEntity> creator;


    private boolean isDeleted;

    public CommunityEntity(){}

    public CommunityEntity(int communityid, String communityName, String address, Set<UserEntity> creator, boolean isDeleted) {
        this.communityid = communityid;
        this.communityName = communityName;
        this.address = address;
        this.creator = creator;
        this.isDeleted = isDeleted;
    }

    public int getCommunityid() {
        return communityid;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<UserEntity> getCreator() {
        return creator;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
