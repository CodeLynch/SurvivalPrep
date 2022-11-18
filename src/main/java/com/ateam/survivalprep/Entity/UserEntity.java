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
@Table(name="tbl_user")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String contactno;

    @ManyToOne(targetEntity = FamilyEntity.class)
    @JoinColumn(name = "familyid")
    private Set<FamilyEntity> family;

    // @OneToMany(cascade = CascadeType.MERGE)
    // private Set<FamilyEntity> createdFamilies;

    @ManyToOne(targetEntity = CommunityEntity.class)
    @JoinColumn(name = "communityid")
    private Set<CommunityEntity> community;

    // @OneToMany(cascade = CascadeType.MERGE)
    // private Set<CommunityEntity> createdCommunities;
    
    
    private boolean isadmin;
    private boolean ismoderator;
    private boolean isdeleted;

    public UserEntity(){}
    
    

    public UserEntity(int userid, String username, String firstname, String lastname, String email, String password,
            String contactno, Set<FamilyEntity> family, /*Set<FamilyEntity> createdFamilies,*/
            Set<CommunityEntity> community, /*Set<CommunityEntity> createdCommunities,*/ boolean isadmin,
            boolean ismoderator, boolean isdeleted) {
        this.userid = userid;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.contactno = contactno;
        this.family = family;
        // this.createdFamilies = createdFamilies;
        this.community = community;
        // this.createdCommunities = createdCommunities;
        this.isadmin = isadmin;
        this.ismoderator = ismoderator;
        this.isdeleted = isdeleted;
    }

    
    // public Set<FamilyEntity> getCreatedFamilies() {
    //     return createdFamilies;
    // }

    // public void setCreatedFamilies(Set<FamilyEntity> createdFamilies) {
    //     this.createdFamilies = createdFamilies;
    // }

    public Set<CommunityEntity> getCommunity() {
        return community;
    }

    public void setCommunity(Set<CommunityEntity> community) {
        this.community = community;
    }

    // public Set<CommunityEntity> getCreatedCommunities() {
    //     return createdCommunities;
    // }

    // public void setCreatedCommunities(Set<CommunityEntity> createdCommunities) {
    //     this.createdCommunities = createdCommunities;
    // }

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


    public Set<FamilyEntity> getFamily() {
        return family;
    }
    
    public void setFamily(Set<FamilyEntity> family) {
        this.family = family;
    }
    
    // public CommunityEntity getCommunity() {
    //     return community;
    // }
    
    // public void setCommunity(CommunityEntity community) {
    //     this.community = community;
    // }    
}
