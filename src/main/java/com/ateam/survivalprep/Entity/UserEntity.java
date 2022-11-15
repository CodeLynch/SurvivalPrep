package com.ateam.survivalprep.Entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String contactno;

    // @ManyToOne(cascade = CascadeType.MERGE)
    // private Set<FamilyEntity> family;

    // private CommunityEntity community;
    private boolean is_admin;
    private boolean is_moderator;
    private boolean isDeleted;

    public UserEntity(){}
    
    public UserEntity(int user_id, String username, String firstname, String lastname, String email, String password,
            String contactno, /*Set<FamilyEntity> family,*/ /*CommunityEntity community,*/ boolean is_admin, boolean is_moderator,
            boolean isDeleted) {
        this.user_id = user_id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.contactno = contactno;
        // this.family = family;
        // this.community = community;
        this.is_admin = is_admin;
        this.is_moderator = is_moderator;
        this.isDeleted = isDeleted;
    }

    public int getUser_id() {
        return user_id;
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


    public boolean isAdmin() {
        return is_admin;
    }

    public void setIsAdmin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public boolean isModerator() {
        return is_moderator;
    }

    public void setIsModerator(boolean is_moderator) {
        this.is_moderator = is_moderator;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    // public Set<FamilyEntity> getFamily() {
    //     return family;
    // }
    
    // public void setFamily(Set<FamilyEntity> family) {
    //     this.family = family;
    // }
    
    // public CommunityEntity getCommunity() {
    //     return community;
    // }
    
    // public void setCommunity(CommunityEntity community) {
    //     this.community = community;
    // }
    


    
}
