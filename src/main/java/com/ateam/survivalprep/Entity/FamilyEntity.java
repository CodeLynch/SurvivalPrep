package com.ateam.survivalprep.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private int familyid;
    
    private String familyname;
    private String invitecode = inviteGenerator();

    // private Set<UserEntity> creator;
    private boolean isdeleted;

    public FamilyEntity(){}

    public FamilyEntity(int familyid, String familyname, /*Set<UserEntity> creator,*/ boolean isdeleted) {
        this.familyid = familyid;
        this.familyname = familyname;
        // this.creator = creator;
        this.isdeleted = isdeleted;
    }

    public int getfamilyid() {
        return familyid;
    }

    public String getfamilyname() {
        return familyname;
    }

    public void setfamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getInvitecode() {
        return invitecode;
    }

    // public Set<UserEntity> getCreator() {
    //     return creator;
    // }

    public boolean isdeleted() {
        return isdeleted;
    }

    public void setDeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    

    

}
