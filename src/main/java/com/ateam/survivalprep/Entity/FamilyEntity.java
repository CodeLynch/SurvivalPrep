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
    private int family_id;
    
    private String family_name;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inviteGenerator")
    @SequenceGenerator(name="inviteGenerator", sequenceName = "inviteSeq", allocationSize=4)
    private String invite_code;

    // private Set<UserEntity> creator;
    private boolean isDeleted;

    public FamilyEntity(){}

    public FamilyEntity(int family_id, String family_name, String invite_code, /*Set<UserEntity> creator,*/
            boolean isDeleted) {
        this.family_id = family_id;
        this.family_name = family_name;
        this.invite_code = invite_code;
        // this.creator = creator;
        this.isDeleted = isDeleted;
    }

    public int getfamily_id() {
        return family_id;
    }

    public String getfamily_name() {
        return family_name;
    }

    public void setfamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getinvite_code() {
        return invite_code;
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
