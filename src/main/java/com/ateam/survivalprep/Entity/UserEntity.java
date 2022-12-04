package com.ateam.survivalprep.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Entity
@Table(name="tbl_user")
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "userid")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(unique=true)
    private String username;
    private String firstname;

    private String lastname;
    
    @Column(unique=true)
    private String email;
    
    private String password;

    @Column(unique=true)
    private String contactno;

    @ManyToOne(targetEntity = FamilyEntity.class)
    @JoinColumn(name = "familyid")
    private FamilyEntity family;

    @ManyToOne(targetEntity = CommunityEntity.class)
    @JoinColumn(name = "communityid")
    private CommunityEntity community;
    
    
    private boolean isadmin;
    private boolean ismoderator;
    private boolean isdeleted;

    public UserEntity(){}
    
    

    public UserEntity(int userid, String username, String firstname, String lastname, String email, String password,
            String contactno, FamilyEntity family, CommunityEntity community, boolean isadmin, boolean ismoderator,
            boolean isdeleted) {
        this.userid = userid;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.contactno = contactno;
        this.family = family;
        this.community = community;
        this.isadmin = isadmin;
        this.ismoderator = ismoderator;
        this.isdeleted = isdeleted;
    }



    public int getUserid() {
        return userid;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactno() {
        return contactno;
    }


    public boolean isadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public boolean ismoderator() {
        return ismoderator;
    }

    public void setIsmoderator(boolean ismoderator) {
        this.ismoderator = ismoderator;
    }

    public boolean isdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public FamilyEntity getFamily() {
        return family;
    }



    public void setFamily(FamilyEntity family) {
        this.family = family;
    }


    @JsonManagedReference
    public CommunityEntity getCommunity() {
        return community;
    }



    public void setCommunity(CommunityEntity community) {
        this.community = community;
    }

    

}
