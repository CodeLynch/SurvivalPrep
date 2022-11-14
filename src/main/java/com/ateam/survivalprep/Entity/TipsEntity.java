package com.ateam.survivalprep.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class TipsEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipId;
    private String tipCategory;
    private String tipContent;
    private boolean isDeleted;
    
    public TipsEntity(){}
	public TipsEntity(int tipId, String tipCategory, String tipContent, boolean isDeleted) {
		super();
		this.tipId = tipId;
		this.tipCategory = tipCategory;
		this.tipContent = tipContent;
		this.isDeleted = isDeleted;
	}
	
	public int getTipId() {
		return tipId;
	}
	public void setTipId(int tipId) {
		this.tipId = tipId;
	}
	public String getTipCategory() {
		return tipCategory;
	}
	public void setTipCategory(String tipCategory) {
		this.tipCategory = tipCategory;
	}
	public String getTipContent() {
		return tipContent;
	}
	public void setTipContent(String tipContent) {
		this.tipContent = tipContent;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
