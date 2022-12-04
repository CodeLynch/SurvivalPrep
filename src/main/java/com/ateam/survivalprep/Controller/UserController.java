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
import com.ateam.survivalprep.Entity.UserEntity;
import com.ateam.survivalprep.Service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	UserService userv;

    //for Registration (Create)
    @PostMapping("/postUser")
	public UserEntity postUser(@RequestBody UserEntity user) {
		return userv.insertUser(user);
    }
    
    //for Log-in (Read)
    @PostMapping("/postLogin")
	public String postLogin(@RequestBody UserEntity user) {
		return userv.LoginUser(user);
    }
    
    //for getting account details (Read)
    @GetMapping("/getUserById")
    public UserEntity getUserById(@RequestParam int id){
    	return userv.getUserById(id);
    }

    //for checking deletion
    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers(){
    	return userv.getAllUsers();
    }

    //for add family member search feature
    @GetMapping("/getUserByNum")
    public UserEntity getUserByNum(@RequestParam String contactNo){
        return userv.getUserByNum(contactNo);
    }
    
    //for getting family members
    @GetMapping("/getFamilyMembers")
    public List<UserEntity> getUsersByFamily(@RequestParam int familyid){
        return userv.getUsersByFamily(familyid);
    }

    //for add family member add feature
    @PutMapping("/putFamily")
    public UserEntity putFamily(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putFamily(id, newUserDetails);
    }

    //for change community feature
    @PutMapping("/putCommunity")
    public UserEntity putCommunity(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
        return userv.putCommunity(id, newUserDetails);
    }

    //for change Username (Update)
    @PutMapping("/putUsername")
    public UserEntity putUsername(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putUsername(id, newUserDetails);
    }
    
    //for change Password (Update)
    @PutMapping("/putPassword")
    public UserEntity putUserPass(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putPassword(id, newUserDetails);
    }

    //for make Admin (Update)
    @PutMapping("/putAdmin")
    public UserEntity putAdmin(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putAdmin(id, newUserDetails);
    }    

    //for make Mod (Update)
    @PutMapping("/putMod")
    public UserEntity putMod(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
    	return userv.putMod(id, newUserDetails);
    }

    //for "Deleting" user (Delete)
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
    	return userv.deleteUser(id);
    }

}
