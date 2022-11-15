package com.ateam.survivalprep.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.FamilyEntity;
import com.ateam.survivalprep.Repository.FamilyRepository;

@Service
public class FamilyService {
    
    @Autowired
	FamilyRepository frepo;
	
	public FamilyEntity insertFamily(FamilyEntity family) {
		return frepo.save(family);
	}
	
	public FamilyEntity getFamilybyCode(String code){
		if(frepo.findByInviteCode(code) != null && !frepo.findByInviteCode(code).isDeleted()){
			return frepo.findByInviteCode(code);
		}else{
			return null;
		}
	}
	public List<FamilyEntity> getAllFamilies(){
	   return frepo.findByIsDeleted(false);
	}
	
	public FamilyEntity putFamilyName(int id, FamilyEntity newFamilyDetails) throws Exception{
		FamilyEntity family = new FamilyEntity();
		
		try {
			family = frepo.findById(id).get();
			family.setfamily_name(newFamilyDetails.getfamily_name());
			return frepo.save(family);

		}catch(NoSuchElementException e){
			throw new Exception("ID number " + id + " does not exist!");
		}
	}

    
	public String deleteFamily(int id) {
		String msg;
		if(frepo.findById(id) != null) {
            FamilyEntity family = frepo.findById(id).get();
            family.setDeleted(true);
			frepo.save(family);
			msg = "Family ID number " + id + " deleted successfully!";
		}else {
			msg = "Family ID number " + id + " is NOT found!";
		}
		return msg;
	}    
}
