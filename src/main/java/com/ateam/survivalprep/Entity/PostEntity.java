package com.ateam.survivalprep.Entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_post")
public class PostEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int postid;
	private String postcontent;
	
	@ManyToOne(targetEntity = UserEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "userid")
	private UserEntity creator;
	
	@ManyToOne(targetEntity = ThreadEntity.class, cascade=CascadeType.MERGE)
    @JoinColumn(name = "forumid")
	private ThreadEntity thread;
	private LocalDateTime datetimecreated = java.time.LocalDateTime.now();
	private boolean isdeleted;
	
	public PostEntity(){}
	
	public PostEntity(int postid, String postcontent, UserEntity creator, ThreadEntity thread,
			boolean isdeleted) {
		super();
		this.postid = postid;
		this.postcontent = postcontent;
		this.creator = creator;
		this.thread = thread;
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

	public UserEntity getCreator() {
		return creator;
	}

	public void setCreator( UserEntity creator) {
		this.creator = creator;
	}

	public ThreadEntity getThread() {
		return thread;
	}

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