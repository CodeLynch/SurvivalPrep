package com.ateam.survivalprep.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.UserEntity;
import com.ateam.survivalprep.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
	UserRepository urepo;
	
	public UserEntity insertUser(UserEntity user) {
		return urepo.save(user);
	}
	
	public List<UserEntity> getAllUsers(){
	   return urepo.findAll();
	}
	
	public UserEntity putUsername(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		
		try {
			user = urepo.findById(id).get();
			user.setUsername(newUserDetails.getUsername());

			return urepo.save(user);
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

    public UserEntity putPassword(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		try {
			user = urepo.findById(id).get();
			user.setPassword(newUserDetails.getPassword());
			return urepo.save(user);
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}
	
	public String deleteUser(int id) {
		String msg;
		if(urepo.findById(id) != null) {
            UserEntity user = urepo.findById(id).get();
            user.setDeleted(true);
			msg = "User ID number " + id + " deleted successfully!";
		}else {
			msg = "User ID number " + id + " is NOT found!";
		}
		return msg;
	}
}
