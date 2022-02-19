package com.cognizant.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Contents {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Lob
private byte[] thumbnail;

@Lob
private byte[] sourceFile;

private boolean theoritical;
private boolean experimental;
private boolean astronomical;
private boolean nuclear;
private boolean particle;
public Contents() {
	super();
	// TODO Auto-generated constructor stub
}
public Contents(int id, byte[] thumbnail) {
	super();
	this.id = id;
	this.thumbnail = thumbnail;
}
public Contents(int id, byte[] thumbnail,byte[] sourceFile, boolean theoritical, boolean experimental, boolean astronomical,
		boolean nuclear, boolean particle) {
	super();
	this.id = id;
	this.thumbnail = thumbnail;
	this.sourceFile = sourceFile;
	this.theoritical = theoritical;
	this.experimental = experimental;
	this.astronomical = astronomical;
	this.nuclear = nuclear;
	this.particle = particle;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public byte[] getThumbnail() {
	return thumbnail;
}
public void setThumbnail(byte[] thumbnail) {
	this.thumbnail = thumbnail;
}

public byte[] getSourceFile() {
	return sourceFile;
}
public void setSourceFile(byte[] sourceFile) {
	this.sourceFile = sourceFile;
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

public String getContentsThumbnail() {
	return Base64.encodeBase64String(thumbnail);
}
public String getFileSource() {
	return Base64.encodeBase64String(sourceFile);
}

@Override
public String toString() {
	return "Contents [id=" + id + ", thumbnail=" + Arrays.toString(thumbnail) + ", theoritical=" + theoritical
			+ ", experimental=" + experimental + ", astronomical=" + astronomical + ", nuclear=" + nuclear
			+ ", particle=" + particle + "]";
}



}
