package com.ateam.survivalprep.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.PostEntity;
import com.ateam.survivalprep.Repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository prepo;
	
	//add post (CREATE)
	public PostEntity insertPost(PostEntity post) {
		return prepo.save(post);
	}
	
	//view all posts that are not deleted (READ)
	public List<PostEntity> getAllPosts(){
		return prepo.findByIsdeleted(false);
	}
	
	//edit post (UPDATE)
	public PostEntity putPostContent(int id, PostEntity newPostDetails) throws Exception{
		PostEntity post = new PostEntity();
		
		try {
			post = prepo.findById(id).get();
			post.setPostcontent(newPostDetails.getPostcontent());
			return prepo.save(post);
			
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
		}
	
	//delete post (DELETE)
	public String deletePost(int id) {
		String msg;
		if(prepo.findById(id) != null) {
			PostEntity post = prepo.findById(id).get();
			post.setDeleted(true);
			prepo.save(post);
			msg = " Post ID number " + id + " deleted successfully! ";
		}else {
			msg = " Post ID number " + id + " is NOT found! ";
		}
		return msg;
	}
}