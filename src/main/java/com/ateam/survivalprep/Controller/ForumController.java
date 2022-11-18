package com.ateam.survivalprep.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/forum")
public class ForumController {
	 @Autowired
	ForumService fserv;
	 
	    //for forum(Create)
	    @PostMapping("/postForum")
		public ForumEntity postUser(@RequestBody ForumEntity forum) {
			return fserv.insertForum(forum);
	    }
		
		//read all forums (READ)
		@GetMapping("/getAllForums")
		public List<ForumEntity> getAllForums(){
			return fserv.getAllForums();
		}
		
		//edit forum title (UPDATE)
		@PutMapping("/putForumTitle")
		public ForumEntity putForumTitle(@RequestParam int id, @RequestBody ForumEntity newForumDetails) throws Exception{
			return fserv.putForumTitle(id, newForumDetails);
		}

        //edit forum desc (UPDATE)
		@PutMapping("/putForumDesc")
		public ForumEntity putForumDesc(@RequestParam int id, @RequestBody ForumEntity newForumDetails) throws Exception{
			return fserv.putForumTitle(id, newForumDetails);
		}
		
		//delete forum feature (DELETE)
		@DeleteMapping("/deleteForum/{id}")
		public String deleteForum(@PathVariable int id) {
			return fserv.deleteForum(id);
		}
}
