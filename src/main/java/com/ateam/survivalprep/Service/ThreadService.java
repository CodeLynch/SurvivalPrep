package com.ateam.survivalprep.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.survivalprep.Entity.ThreadEntity;
import com.ateam.survivalprep.Repository.ThreadRepository;

@Service
public class ThreadService {
	
	@Autowired
	ThreadRepository trepo;
	
	public ThreadEntity insertThread(ThreadEntity thread) {
		return trepo.save(thread);
	}
	
	public List<ThreadEntity> getAllThreads(){
		return trepo.findAll();	
		}
	
	public ThreadEntity putThread(int id, ThreadEntity newThreadDetails) throws Exception{
		ThreadEntity thread = new ThreadEntity();
		
		//try{
		//}{
		//}
	}
	
	public String deleteThread(int id) {
		String msg;
		if(trepo.findById(id) != null) {
			ThreadEntity thread = trepo.findById(id).get();
			thread.setDeleted(true);
			msg = " Thread ID number " + id + " deleted succesfully! ";
		}else {
			msg = " Community ID number " + id + " is NOT found! ";
		}
		return msg;
		}
	}
	