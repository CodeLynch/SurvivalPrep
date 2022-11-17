package com.ateam.survivalprep.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.ForumEntity;
import com.ateam.survivalprep.Repository.ForumRepository;

@Service
public class ForumService {
    @Autowired
	ForumRepository frepo;
	
	public ForumEntity insertForum(ForumEntity forum) {
		return frepo.save(forum);
	}
	
	// public FamilyEntity getFamilybyCode(String code){
	// 	if(frepo.findByInviteCode(code) != null && !frepo.findByInviteCode(code).isDeleted()){
	// 		return frepo.findByInviteCode(code);
	// 	}else{
	// 		return null;
	// 	}
	// }

	public List<ForumEntity> getAllForums(){
	   return frepo.findAll();
	}
	
	public ForumEntity putForumTitle(int id, ForumEntity newForumDetails) throws Exception{
		ForumEntity forum = new ForumEntity();
		
		try {
			forum = frepo.findById(id).get();
			forum.setForumTitle(newForumDetails.getForumTitle());
			return frepo.save(forum);
			
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

	public String deleteForum(int id) {
		String msg;
		if(frepo.findById(id) != null) {
            ForumEntity forum = frepo.findById(id).get();
            forum.setDeleted(true);
			frepo.save(forum);
			msg = "Forum ID number " + id + " deleted successfully!";
		}else {
			msg = "Forum ID number " + id + " is NOT found!";
		}
		return msg;
	}    
}
