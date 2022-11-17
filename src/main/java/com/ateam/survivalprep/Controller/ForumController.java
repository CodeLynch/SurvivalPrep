// package com.ateam.survivalprep.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.ateam.survivalprep.Entity.ForumEntity;
// import com.ateam.survivalprep.Service.ForumService;

// @RestController
// @RequestMapping("/forum")
// public class ForumController {
// 	 @Autowired
// 	ForumService fserv;
	 
// 	    //for forum(Create)
// 	    @PostMapping("/postUser")
// 		public ForumEntity postUser(@RequestBody ForumEntity forum) {
// 			return fserv.insertForum(forum);
// 	    }
		
// 		//read all tips (READ)
// 		@GetMapping("/getAllTips")
// 		public List<ForumEntity> getAllTips(){
// 			return fserv.getAllTips();
// 		}
		
// 		//edit tip content (UPDATE)
// 		@PutMapping("/putTipContent")
// 		public ForumEntity putTipContent(@RequestParam int id, @RequestBody ForumEntity newTipDetails) throws Exception{
// 			return fserv.putTipContent(id, newTipDetails);
// 		}
		
// 		//delete tip feature (DELETE)
// 		@DeleteMapping("/deleteTip/{id}")
// 		public String deleteTip(@PathVariable int id) {
// 			return fserv.deleteTip(id);
// 		}
// }
