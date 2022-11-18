package com.ateam.survivalprep.Entity;

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
	private int threadID;
	private String threadTitle;
	private String creator;
	private String forum;
	private int dateTimeCreated;
	//private Set<UserEntity>Creator;
	private boolean isDeleted;
	
	public ThreadEntity(){}
	
	public ThreadEntity(int threadID, String threadTitle, String creator, String forum, int dateTimeCreated,
			boolean isDeleted) {
		super();
		this.threadID = threadID;
		this.threadTitle = threadTitle;
		this.creator = creator;
		this.forum = forum;
		this.dateTimeCreated = dateTimeCreated;
		this.isDeleted = isDeleted;
	}

	public int getThreadID() {
		return threadID;
	}

	public void setThreadID(int threadID) {
		this.threadID = threadID;
	}

	public String getThreadTitle() {
		return threadTitle;
	}

	public void setThreadTitle(String threadTitle) {
		this.threadTitle = threadTitle;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getForum() {
		return forum;
	}

	public void setForum(String forum) {
		this.forum = forum;
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