package com.ateam.survivalprep.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.PostEntity;
import com.ateam.survivalprep.Repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository prepo;
	
	public PostEntity insertPost(PostEntity post) {
		return prepo.save(post);
	}
	
	public List<PostEntity> getAllPosts(){
		return prepo.findAll();
	}
	
//	public PostEntity putPost(int id, PostEntity newPostDetails) throws Exception{
//		PostEntity post = new PostEntity();
//		
//		//try{
//		//}{
//		//}	
//		}
	
	public String deletePost(int id) {
		String msg;
		if(prepo.findById(id) != null) {
			PostEntity post = prepo.findById(id).get();
			post.setDeleted(true);
			msg = " Post ID number " + id + " deleted successfully! ";
		}else {
			msg = " Post ID number " + id + " is NOT found! ";
		}
		return msg;
		
	}
}