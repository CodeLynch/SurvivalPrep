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
	
	//for register feature (CREATE)
	public UserEntity insertUser(UserEntity user) {
		return urepo.save(user);
	}
	
	//for log-in feature (READ)
	public String LoginUser(UserEntity user){
		String email = user.getEmail();
		String pass = user.getPassword();
			if(urepo.findByEmail(email) != null && !urepo.findByEmail(email).isdeleted()){
				UserEntity userAccount = urepo.findByEmail(email);
				if(userAccount.getPassword().equals(pass)){
					return userAccount.getUserid()+"";
				}else{
					return "Incorrect Password!";
				}
			}else{
				return "No User Found!";
			}
	}

	//for profile feature (READ)
	public UserEntity getUserById(int id) {
		return urepo.findByUserid(id);
	}

	//check if users are getting deleted
	public List<UserEntity> getAllUsers(){
	   return urepo.findByIsdeleted(false);
	}

	//for searching in add family member feature;
	public UserEntity getUserByNum(String number){
		if(urepo.findByContactno(number) != null && !urepo.findByContactno(number).isdeleted()){
			return urepo.findByContactno(number);
		}else{
			System.out.println("No User Found");
			return null;
		}
	}
	// for adding in add family member feature
	public UserEntity putFamily(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		try {
			user = urepo.findById(id).get();
			user.setFamily(newUserDetails.getFamily());
			return urepo.save(user);
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

	// for change communithy feature
	public UserEntity putCommunity(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		try {
			user = urepo.findById(id).get();
			user.setCommunity(newUserDetails.getCommunity());
			return urepo.save(user);
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}
	
	//for change Username feature (UPDATE)
	public UserEntity putUsername(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		try {
			user = urepo.findById(id).get();
			if(!user.isdeleted()){
				user.setUsername(newUserDetails.getUsername());
				return urepo.save(user);
			}else{
				return null;
			}
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

	//for change Password feature (UPDATE)
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

	//for giving user admin privileges (UPDATE)
	public UserEntity putAdmin(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		try {
			user = urepo.findById(id).get();
			user.setIsadmin(newUserDetails.isadmin());
			return urepo.save(user);
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

	//for giving user moderator privileges (UPDATE)
	public UserEntity putMod(int id, UserEntity newUserDetails) throws Exception{
		UserEntity user = new UserEntity();
		try {
			user = urepo.findById(id).get();
			user.setIsmoderator(newUserDetails.ismoderator());
			return urepo.save(user);
		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}
	
	//for delete account feature (DELETE)
	public String deleteUser(int id) {
		String msg;
		if(urepo.findById(id) != null) {
            UserEntity user = urepo.findById(id).get();
            user.setIsdeleted(true);;
			urepo.save(user);
			msg = "User ID number " + id + " deleted successfully!";
		}else {
			msg = "User ID number " + id + " is NOT found!";
		}
		return msg;
	}
}
