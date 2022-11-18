package com.ateam.survivalprep.Entity;

import java.time.LocalDateTime;

//import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_thread")
public class ThreadEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int threadid;
	private String threadtitle;
	//private UserEntity creator;
	//private ForumEntity forum;
	private LocalDateTime datetimecreated = java.time.LocalDateTime.now();
	//private Set<UserEntity>Creator;
	private boolean isdeleted;
	
	public ThreadEntity(){}
	
	public ThreadEntity(int threadid, String threadtitle, /*String creator, String forum,*/
			boolean isdeleted) {
		super();
		this.threadid = threadid;
		this.threadtitle = threadtitle;
		//this.creator = creator;
		//this.forum = forum;
		this.isdeleted = isdeleted;
	}

	public int getThreadid() {
		return threadid;
	}

	public void setThreadid(int threadid) {
		this.threadid = threadid;
	}

	public String getThreadtitle() {
		return threadtitle;
	}

	public void setThreadtitle(String threadtitle) {
		this.threadtitle = threadtitle;
	}

	// public String getCreator() {
	// 	return creator;
	// }

	// public void setCreator(String creator) {
	// 	this.creator = creator;
	// }

	// public String getForum() {
	// 	return forum;
	// }

	// public void setForum(String forum) {
	// 	this.forum = forum;
	// }

	public LocalDateTime getDatetimecreated() {
		return datetimecreated;
	}

	public void setDatetimecreated(LocalDateTime datetimecreated) {
		this.datetimecreated = datetimecreated;
	}

	public boolean isdeleted() {
		return isdeleted;
	}

	public void setDeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
}