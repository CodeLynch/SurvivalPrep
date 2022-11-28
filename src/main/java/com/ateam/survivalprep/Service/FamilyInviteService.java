package com.ateam.survivalprep.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.FamilyInviteEntity;
import com.ateam.survivalprep.Repository.FamilyInviteRepository;

@Service
public class FamilyInviteService {
    @Autowired
	FamilyInviteRepository frepo;
	
	public FamilyInviteEntity insertInvite(FamilyInviteEntity invite) {
		return frepo.save(invite);
	}
	
	
	public List<FamilyInviteEntity> getAllInvites(){
	   return frepo.findByIsdeleted(false);
	}

    public List<FamilyInviteEntity> getAllInvitesByInvitee(int id){
        return frepo.findAllByInviteeUserid(id);
     }
    
    public List<FamilyInviteEntity> getAllInvitesByInviter(int id){
        return frepo.findAllByInviterUserid(id);
    }
	
    public FamilyInviteEntity putIsAccepted(int id, FamilyInviteEntity newInviteDetails) throws Exception{
		FamilyInviteEntity invite = new FamilyInviteEntity();	
		try {
			invite = frepo.findById(id).get();
			if(!invite.isdeleted()){
				invite.setIsaccepted(newInviteDetails.isaccepted());
                invite.setIsdeleted(true);
				return frepo.save(invite);
			}else{
				return null;
			}

		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}
    
	public String deleteInvite(int id) {
		String msg;
		if(frepo.findById(id) != null) {
            FamilyInviteEntity invite = frepo.findById(id).get();
            invite.setIsdeleted(true);
			frepo.save(invite);
			msg = "Family ID number " + id + " deleted successfully!";
		}else {
			msg = "Family ID number " + id + " is NOT found!";
		}
		return msg;
	}    
}
