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

    //for generation of invite codes
    private static String inviteGenerator(){
         String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
         StringBuilder strbuild = new StringBuilder(4);
            for (int i = 0; i < 4; i++) {
                int val = (int)(AlphaNumericString.length() * Math.random());
                strbuild.append(AlphaNumericString.charAt(val));
               }
        return strbuild.toString();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int family_id;
    
    private String family_name;
    private String inviteCode = inviteGenerator();

    // private Set<UserEntity> creator;
    private boolean isDeleted;

    public FamilyEntity(){}

    public FamilyEntity(int family_id, String family_name, /*Set<UserEntity> creator,*/ boolean isDeleted) {
        this.family_id = family_id;
        this.family_name = family_name;
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
