package com.ateam.survivalprep.Entity;

//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_tip")
public class TipsEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipid;
    private String tipcategory;
    private String tipcontent;
    private boolean isdeleted;
    
    public TipsEntity(){}
	public TipsEntity(int tipid, String tipcategory, String tipcontent, boolean isdeleted) {
		super();
		this.tipid = tipid;
		this.tipcategory = tipcategory;
		this.tipcontent = tipcontent;
		this.isdeleted = isdeleted;
	}
	
	public int getTipid() {
		return tipid;
	}

	public String getTipcategory() {
		return tipcategory;
	}
	public void setTipcategory(String tipcategory) {
		this.tipcategory = tipcategory;
	}
	public String getTipcontent() {
		return tipcontent;
	}
	public void setTipcontent(String tipcontent) {
		this.tipcontent = tipcontent;
	}
	public boolean isdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

}
