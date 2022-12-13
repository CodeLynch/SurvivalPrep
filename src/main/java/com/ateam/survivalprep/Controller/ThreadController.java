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

import com.ateam.survivalprep.Entity.ThreadEntity;
import com.ateam.survivalprep.Service.ThreadService;

@CrossOrigin
@RestController
@RequestMapping("/thread")
public class ThreadController{
	@Autowired
	ThreadService tserv;
	
	@PostMapping("/postThread")
	public ThreadEntity postThread(@RequestBody ThreadEntity thread) {
		return tserv.insertThread(thread);
	}
	
	@GetMapping("/getAllThreads")
	public List<ThreadEntity> getAllThreads(){
		return tserv.getAllThreads();
	}

	@GetMapping("/getAllThreadsByForum")
	public List<ThreadEntity> getAllThreadsByForum(@RequestParam int id){
		return tserv.getAllThreadsByForum(id);
	}
	
	@PutMapping("/putThreadTitle")
	public ThreadEntity putThreadTitle(@RequestParam int id, @RequestBody ThreadEntity newThreadDetails) throws Exception{
		return tserv.putThreadTitle(id, newThreadDetails);
	}
	
	@DeleteMapping("/deleteThread/{id}")
	public String deleteThread(@PathVariable int id) {
		return tserv.deleteThread(id);
	}

}