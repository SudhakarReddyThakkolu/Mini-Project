package com.cognizant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Creator_Details")
@Component
public class Creator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int creatorId;
    
	private String creatorName;
	private String password;
	private int creatorAge;
	private String emailId;
	@Lob
	private byte[] creatorPic;
	public Creator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Creator(int creatorId, String creatorName, String password, int creatorAge, String emailId) {
		super();
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.password = password;
		this.creatorAge = creatorAge;
		this.emailId = emailId;
	}
	public Creator(int creatorId, String creatorName, String password, int creatorAge, String emailId,
			byte[] creatorPic) {
		super();
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.password = password;
		this.creatorAge = creatorAge;
		this.emailId = emailId;
		this.creatorPic = creatorPic;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCreatorAge() {
		return creatorAge;
	}
	public void setCreatorAge(int creatorAge) {
		this.creatorAge = creatorAge;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public byte[] getCreatorPic() {
		return creatorPic;
	}
	public void setCreatorPic(byte[] creatorPic) {
		this.creatorPic = creatorPic;
	}
	
	public String getCreatorPicture() {
		return Base64.encodeBase64String(creatorPic);
	}
	@Override
	public String toString() {
		return "Creator [creatorId=" + creatorId + ", creatorName=" + creatorName + ", Password=" + password
				+ ", creatorAge=" + creatorAge + ", emailId=" + emailId + "]";
	}
	
	
 }
