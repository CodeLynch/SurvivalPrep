package com.ateam.survivalprep.Entity;

//import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_forum")
public class ForumEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int forumID;
	private String forumTitle;
	private String forumDesc;
	private String creator;
	private String community;
	private int dateTimeDeleted;
	//private Set<UserEntity> creator;
	private boolean isDeleted;
	
	public ForumEntity(){}
	
	public ForumEntity(int forumID, String forumTitle, String forumDesc, String creator, String community,
			int dateTimeDeleted, boolean isDeleted) {
		super();
		this.forumID = forumID;
		this.forumTitle = forumTitle;
		this.forumDesc = forumDesc;
		this.creator = creator;
		this.community = community;
		this.dateTimeDeleted = dateTimeDeleted;
		this.isDeleted = isDeleted;
	}

	public int getForumID() {
		return forumID;
	}

	public void setForumID(int forumID) {
		this.forumID = forumID;
	}

	public String getForumTitle() {
		return forumTitle;
	}

	public void setForumTitle(String forumTitle) {
		this.forumTitle = forumTitle;
	}

	public String getForumDesc() {
		return forumDesc;
	}

	public void setForumDesc(String forumDesc) {
		this.forumDesc = forumDesc;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public int getDateTimeDeleted() {
		return dateTimeDeleted;
	}

	public void setDateTimeDeleted(int dateTimeDeleted) {
		this.dateTimeDeleted = dateTimeDeleted;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
