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

import com.ateam.survivalprep.Entity.TipsEntity;
import com.ateam.survivalprep.Service.TipsService;

@RestController
@RequestMapping("/tip")
public class TipsController {
	@Autowired
	TipsService tserv;

    @PostMapping("/postTip")
	public TipsEntity postTip(@RequestBody TipsEntity tips) {
		return tserv.insertTip(tips);
    }
    
    @GetMapping("/getAllTips")
    public List<TipsEntity> getAllTips(){
    	return tserv.getAllTips();
    }
     
    @PutMapping("/putTipContent")
    public TipsEntity putTipContent(@RequestParam int id, @RequestBody TipsEntity newTipDetails) throws Exception{
    	return tserv.putTipContent(id, newTipDetails);
    }
    
    @DeleteMapping("/deleteTip/{id}")
    public String deleteTip(@PathVariable int id) {
    	return tserv.deleteTip(id);
    }
}
