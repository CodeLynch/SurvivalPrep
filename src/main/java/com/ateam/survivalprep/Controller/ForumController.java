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

import com.ateam.survivalprep.Entity.ForumEntity;
import com.ateam.survivalprep.Service.ForumService;

@CrossOrigin
@RestController
@RequestMapping("/forum")
public class ForumController{
	@Autowired
	ForumService fserv;
	
	@PostMapping("/postForum")
	public ForumEntity postForum(@RequestBody ForumEntity forum) {
		return fserv.insertForum(forum);
	}
	
	@GetMapping("/getAllForums")
	public List<ForumEntity> getAllForums(){
		return fserv.getAllForums();
	}
	
	@PutMapping("/putForumTitle")
	public ForumEntity putForumTitle(@RequestParam int id, @RequestBody ForumEntity newForumDetails) throws Exception{
		return fserv.putForumTitle(id, newForumDetails);
	}

	@PutMapping("/putForumDesc")
	public ForumEntity putForumDesc(@RequestParam int id, @RequestBody ForumEntity newForumDetails) throws Exception{
		return fserv.putForumDesc(id, newForumDetails);
	}
	
	@DeleteMapping("/deleteForum/{id}")
	public String deleteForum(@PathVariable int id) {
		return fserv.deleteForum(id);
	}
	
}

