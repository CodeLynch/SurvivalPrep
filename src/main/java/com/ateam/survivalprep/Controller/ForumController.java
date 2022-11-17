package com.ateam.survivalprep.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ateam.survivalprep.Entity.ForumEntity;
import com.ateam.survivalprep.Entity.UserEntity;
import com.ateam.survivalprep.Service.ForumService;

@RestController
@RequestMapping("/forum")
public class ForumController {
	 @Autowired
	ForumService fserv;
	 
	    //for forum(Create)
	    @PostMapping("/postUser")
		public ForumEntity postUser(@RequestBody ForumEntity forum) {
			return fserv.insertForum(forum);
			
				
	    
	    }
}
