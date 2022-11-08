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

import com.ateam.survivalprep.Entity.FamilyEntity;
import com.ateam.survivalprep.Service.FamilyService;

@RestController
@RequestMapping("/family")
public class FamilyController{
    @Autowired
	FamilyService fserv;

    @PostMapping("/postFamily")
	public FamilyEntity postFamily(@RequestBody FamilyEntity family) {
		return fserv.insertFamily(family);
    }
    
    @GetMapping("/getAllFamilies")
    public List<FamilyEntity> getAllFamilies(){
    	return fserv.getAllFamilies();
    }
     
    @PutMapping("/putFamily")
    public FamilyEntity putFamily(@RequestParam int id, @RequestBody FamilyEntity newFamilyDetails) throws Exception{
    	return fserv.putFamilyName(id, newFamilyDetails);
    }

    @DeleteMapping("/deleteFamily/{id}")
    public String deleteFamily(@PathVariable int id) {
    	return fserv.deleteFamily(id);
    }

}
