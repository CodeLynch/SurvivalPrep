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
	public UserEntity getUser(UserEntity user){
		String email = user.getEmail();
		String pass = user.getPassword();
			if(urepo.findByEmail(email) != null && !user.isDeleted()){
				UserEntity userAccount = urepo.findByEmail(email);
				if(userAccount.getPassword() == pass){
					return userAccount;
				}else{
					System.out.println("Incorrect Password!");
					return null;
				}
			}else{
				System.out.println("No User Found!");
				return null;
			}
	}

	//check if users are getting deleted
	public List<UserEntity> getAllUsers(){
	   return urepo.findByIsDeleted(false);
	}

	public UserEntity getUserByNum(String number){
		if(urepo.findByContactno(number) != null){
			return urepo.findByContactno(number);
		}else{
			System.out.println("No User Found");
			return null;
		}
	}
	
	//for change Username feature (UPDATE)
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
	
	//for delete account feature (DELETE)
	public String deleteUser(int id) {
		String msg;
		if(urepo.findById(id) != null) {
            UserEntity user = urepo.findById(id).get();
            user.setIsDeleted(true);;
			urepo.save(user);
			msg = "User ID number " + id + " deleted successfully!";
		}else {
			msg = "User ID number " + id + " is NOT found!";
		}
		return msg;
	}
}
