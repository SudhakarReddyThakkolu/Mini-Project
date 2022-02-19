package com.cognizant.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Learner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int learnerId;
	private String name;
	private int age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String emailId;
	private String password;
	private boolean theoritical;
	private boolean experimental;
	private boolean astronomical;
	private boolean nuclear;
	private boolean particle;
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Learner(int learnerId, String name, int age, Date dob, String emailId, String password, boolean theoritical,
			boolean experimental, boolean astronomical, boolean nuclear, boolean particle) {
		super();
		this.learnerId = learnerId;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.emailId = emailId;
		this.password = password;
		this.theoritical = theoritical;
		this.experimental = experimental;
		this.astronomical = astronomical;
		this.nuclear = nuclear;
		this.particle = particle;
	}
	public int getLearnerId() {
		return learnerId;
	}
	public void setLearnerId(int learnerId) {
		this.learnerId = learnerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isTheoritical() {
		return theoritical;
	}
	public void setTheoritical(boolean theoritical) {
		this.theoritical = theoritical;
	}
	public boolean isExperimental() {
		return experimental;
	}
	public void setExperimental(boolean experimental) {
		this.experimental = experimental;
	}
	public boolean isAstronomical() {
		return astronomical;
	}
	public void setAstronomical(boolean astronomical) {
		this.astronomical = astronomical;
	}
	public boolean isNuclear() {
		return nuclear;
	}
	public void setNuclear(boolean nuclear) {
		this.nuclear = nuclear;
	}
	public boolean isParticle() {
		return particle;
	}
	public void setParticle(boolean particle) {
		this.particle = particle;
	}
	@Override
	public String toString() {
		return "Learner [learnerId=" + learnerId + ", name=" + name + ", age=" + age + ", dob=" + dob + ", emailId="
				+ emailId + ", password=" + password + ", theoritical=" + theoritical + ", experimental=" + experimental
				+ ", astronomical=" + astronomical + ", nuclear=" + nuclear + ", particle=" + particle + "]";
	}
	
}
