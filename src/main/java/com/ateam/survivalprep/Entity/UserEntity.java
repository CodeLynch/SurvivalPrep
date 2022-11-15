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
    private int userId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String contactNo;

    // @ManyToOne(cascade = CascadeType.MERGE)
    // private Set<FamilyEntity> family;

    // private CommunityEntity community;
    private boolean isAdmin;
    private boolean isModerator;
    private boolean isDeleted;

    public UserEntity(){}
    
    public UserEntity(int userId, String username, String firstName, String lastName, String email, String password,
            String contactNo, /*Set<FamilyEntity> family,*/ /*CommunityEntity community,*/ boolean isAdmin, boolean isModerator,
            boolean isDeleted) {
        this.userId = userId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.contactNo = contactNo;
        // this.family = family;
        // this.community = community;
        this.isAdmin = isAdmin;
        this.isModerator = isModerator;
        this.isDeleted = isDeleted;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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
    
    public boolean isAdmin() {
        return isAdmin;
    }
    
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public boolean isModerator() {
        return isModerator;
    }
    
    public void setModerator(boolean isModerator) {
        this.isModerator = isModerator;
    }
    
    public boolean isDeleted() {
        return isDeleted;
    }
    
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }



    
}
