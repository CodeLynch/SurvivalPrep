package com.ateam.survivalprep.Service;

import java.util.List;

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
	
	public List<ForumEntity> getAllForums(){
		return frepo.findAll();
	}
	
	public ForumEntity putForum(int id, ForumEntity newForumDetails) throws Exception{
		ForumEntity forum = new ForumEntity();
		
		//try{
		//}{
		//}
		
	}
	
	public String deleteForum(int id) {
		String msg;
		if(frepo.findById(id) != null) {
			ForumEntity forum = frepo.findById(id).get();
			forum.setDeleted(true);
			msg = " Forum ID number " + id + " deleted succesfully! ";
		}else {
			msg = " Forum ID number " + id + " is NOT found! ";
		}
		return msg;
		}
	}	