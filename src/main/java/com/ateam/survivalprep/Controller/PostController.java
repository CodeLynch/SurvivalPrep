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

import com.ateam.survivalprep.Entity.PostEntity;
import com.ateam.survivalprep.Service.PostService;

@CrossOrigin
@RestController
@RequestMapping("/post")
public class PostController{
	@Autowired
	PostService pserv;
	
	@PostMapping("/postPost")
	public PostEntity postPost(@RequestBody PostEntity post) {
		return pserv.insertPost(post);
	}
	
	@GetMapping("/getAllPosts")
	public List<PostEntity> getAllPosts(){
		return pserv.getAllPosts();
	}

	@GetMapping("/getAllPostsByUser")
	public List<PostEntity> getAllPostsByUser(@RequestParam int id){
		return pserv.getAllPostsOfUser(id);
	}

	@GetMapping("/getAllPostsByThread")
	public List<PostEntity> getAllPostsByThread(@RequestParam int id){
		return pserv.getAllPostsOfThread(id);
	}
	
	@PutMapping("/putPostContent")
	public PostEntity putPostContent(@RequestParam int id, @RequestBody PostEntity newPostDetails) throws Exception{
		return pserv.putPostContent(id, newPostDetails);
	}
	
	@DeleteMapping("/deletePost/{id}")
	public String deletePost(@PathVariable int id) {
		return pserv.deletePost(id);
	}
	
}