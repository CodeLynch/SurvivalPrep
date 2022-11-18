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
	
	//create Forum feature (CREATE)
	public ForumEntity insertForum(ForumEntity forum) {
		return frepo.save(forum);
	}

	public List<ForumEntity> getAllForums(){
	   return frepo.findByIsdeleted(false);
	}
	
	//edit forum title (UPDATE)
	public ForumEntity putForumTitle(int id, ForumEntity newForumDetails) throws Exception{
		ForumEntity forum = new ForumEntity();
		
		try {
			forum = frepo.findById(id).get();
			forum.setForumtitle(newForumDetails.getForumtitle());
			return frepo.save(forum);
			
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

		//edit forum description (UPDATE)
		public ForumEntity putForumDesc(int id, ForumEntity newForumDetails) throws Exception{
			ForumEntity forum = new ForumEntity();
			
			try {
				forum = frepo.findById(id).get();
				forum.setForumdesc(newForumDetails.getForumdesc());
				return frepo.save(forum);
				
			}catch(NoSuchElementException e){
				throw new Exception("ID number " + id + " does not exist!");
			}
		}

	//delete forum feature (DELETE) 
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
