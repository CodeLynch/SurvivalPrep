package com.ateam.survivalprep.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.CommunityEntity;
import com.ateam.survivalprep.Repository.CommunityRepository;

@Service
public class CommunityService {
        
    @Autowired
	CommunityRepository crepo;
	
	public CommunityEntity insertCommunity(CommunityEntity community) {
		return crepo.save(community);
	}
	
	public List<CommunityEntity> getAllUCommunities(){
	   return crepo.findAll();
	}
	
	public CommunityEntity putCommunity(int id, CommunityEntity newComDetails) throws Exception{
		CommunityEntity community = new CommunityEntity();
		
		try {
			community = crepo.findById(id).get();
			community.setCommunityName(newComDetails.getCommunityName());
            community.setAddress(newComDetails.getAddress());
			return crepo.save(community);

		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

    
	public String deleteCommunity(int id) {
		String msg;
		if(crepo.findById(id) != null) {
            CommunityEntity community = crepo.findById(id).get();
            community.setDeleted(true);
			msg = "Community ID number " + id + " deleted successfully!";
		}else {
			msg = "Community ID number " + id + " is NOT found!";
		}
		return msg;
	}
}
