package com.ateam.survivalprep.Entity;

import java.time.LocalDateTime;

//import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_post")
public class PostEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int postid;
	private String postcontent;
	//private UserEntity creator;
	//private ThreadEntity thread;
	private LocalDateTime datetimecreated = java.time.LocalDateTime.now();
	//private Set<UserEntity> creator;
	private boolean isdeleted;
	
	public PostEntity(){}
	
	public PostEntity(int postid, String postcontent, /*String creator, String thread,*/
			boolean isdeleted) {
		super();
		this.postid = postid;
		this.postcontent = postcontent;
		// this.creator = creator;
		// this.thread = thread;
		this.isdeleted = isdeleted;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getPostcontent() {
		return postcontent;
	}

	public void setPostcontent(String postcontent) {
		this.postcontent = postcontent;
	}

	// public String getCreator() {
	// 	return creator;
	// }

	// public void setCreator(String creator) {
	// 	this.creator = creator;
	// }

	// public String getThread() {
	// 	return thread;
	// }

	// public void setThread(String thread) {
	// 	this.thread = thread;
	// }

	public LocalDateTime getDatetimecreated() {
		return datetimecreated;
	}

	public boolean isdeleted() {
		return isdeleted;
	}

	public void setDeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
}