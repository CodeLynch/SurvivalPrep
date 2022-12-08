package com.ateam.survivalprep.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ateam.survivalprep.Entity.FamilyInviteEntity;
import com.ateam.survivalprep.Service.FamilyInviteService;

@CrossOrigin
@RestController
@RequestMapping("/invite")
public class FamilyInviteController {
    @Autowired
	FamilyInviteService fserv;

    //for invite feature (CREATE)
    @PostMapping("/postInvite")
	public FamilyInviteEntity postInvite(@RequestBody FamilyInviteEntity invite) {
		return fserv.insertInvite(invite);
    }
    
    //check to see if deleted invites are still shown (READ)
    @GetMapping("/getAllInvites")
    public List<FamilyInviteEntity> getAllInvites(){
    	return fserv.getAllInvites();
    }

    //get invites received by a user (READ)  
    @GetMapping("/getInvitesByInvitee")
    public List<FamilyInviteEntity> getFamilyByInvitee(@RequestParam int id){
    	return fserv.getAllInvitesByInvitee(id);
    }

    //get invites sent by a user (READ)  
    @GetMapping("/getInvitesByInviter")
    public List<FamilyInviteEntity> getFamilyByInviter(@RequestParam int id){
    	return fserv.getAllInvitesByInviter(id);
    }

    //accept invite (UPDATE & DELETE) 
    @PutMapping("/putIsAccepted")
    public FamilyInviteEntity putFamily(@RequestParam int id, @RequestBody FamilyInviteEntity newInviteDetails) throws Exception{
        return fserv.putIsAccepted(id, newInviteDetails);
    }

    //reject invite (DELETE)
    @DeleteMapping("/deleteInvite/{id}")
    public String deleteInvite(@PathVariable int id) {
    	return fserv.deleteInvite(id);
    }
}
