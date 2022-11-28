package com.ateam.survivalprep.Entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_familyinvite")
public class FamilyInviteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inviteid;
    
    @ManyToOne(targetEntity = FamilyEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "familyid")
    private FamilyEntity family;

    @ManyToOne(targetEntity = UserEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "inviterid", referencedColumnName ="userid" )
    private UserEntity inviter;

    @ManyToOne(targetEntity = UserEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "inviteeid", referencedColumnName ="userid" )
    private UserEntity invitee;

    private LocalDateTime datetimeinvited = java.time.LocalDateTime.now();
    private boolean isaccepted; 
    private boolean isdeleted;

    public FamilyInviteEntity(){
        
    }
    public FamilyInviteEntity(int inviteid, FamilyEntity family, UserEntity inviter, UserEntity invitee,
            LocalDateTime datetimeinvited, boolean isaccepted, boolean isdeleted) {
        this.inviteid = inviteid;
        this.family = family;
        this.inviter = inviter;
        this.invitee = invitee;
        this.datetimeinvited = datetimeinvited;
        this.isaccepted = isaccepted;
        this.isdeleted = isdeleted;
    }

    public int getInviteid() {
        return inviteid;
    }

    public FamilyEntity getFamily() {
        return family;
    }

    public UserEntity getInviter() {
        return inviter;
    }

    public UserEntity getInvitee() {
        return invitee;
    }

    public LocalDateTime getDatetimeinvited() {
        return datetimeinvited;
    }

    public boolean isaccepted() {
        return isaccepted;
    }

    public void setIsaccepted(boolean isaccepted) {
        this.isaccepted = isaccepted;
    }

    public boolean isdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }    
}
