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

import com.ateam.survivalprep.Entity.UserEntity;
import com.ateam.survivalprep.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	UserService userv;

    @PostMapping("/postUser")
	public UserEntity postUser(@RequestBody UserEntity user) {
		return userv.insertUser(user);
    }
    
    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers(){
    	return userv.getAllUsers();
    }
     
    @PutMapping("/putUsername")
    public UserEntity putUsername(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putUsername(id, newUserDetails);
    }

    @PutMapping("/putPassword")
    public UserEntity putUserPass(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putPassword(id, newUserDetails);
    }
    
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
    	return userv.deleteUser(id);
    }

}
