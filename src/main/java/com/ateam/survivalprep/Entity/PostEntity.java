package com.ateam.survivalprep.Entity;

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
	
	private int postID;
	private String postContent;
	private String creator;
	private String thread;
	private int dateTimeCreated;
	//private Set<UserEntity> creator;
	private boolean isDeleted;
	
	public PostEntity(){}
	
	public PostEntity(int postID, String postContent, String creator, String thread, int dateTimeCreated,
			boolean isDeleted) {
		super();
		this.postID = postID;
		this.postContent = postContent;
		this.creator = creator;
		this.thread = thread;
		this.dateTimeCreated = dateTimeCreated;
		this.isDeleted = isDeleted;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public int getDateTimeCreated() {
		return dateTimeCreated;
	}

	public void setDateTimeCreated(int dateTimeCreated) {
		this.dateTimeCreated = dateTimeCreated;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}