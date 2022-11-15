package com.ateam.survivalprep.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_family")
public class FamilyEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int familyID;
    
    private String familyName;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inviteGenerator")
    @SequenceGenerator(name="inviteGenerator", sequenceName = "inviteSeq", allocationSize=4)
    private String inviteCode;

    // private Set<UserEntity> creator;
    private boolean isDeleted;

    public FamilyEntity(){}

    public FamilyEntity(int familyID, String familyName, String inviteCode, /*Set<UserEntity> creator,*/
            boolean isDeleted) {
        this.familyID = familyID;
        this.familyName = familyName;
        this.inviteCode = inviteCode;
        // this.creator = creator;
        this.isDeleted = isDeleted;
    }

    public int getFamilyID() {
        return familyID;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    // public Set<UserEntity> getCreator() {
    //     return creator;
    // }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    

    

}
