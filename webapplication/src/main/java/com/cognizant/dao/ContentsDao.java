package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Contents;

@Service
public interface ContentsDao {

	public void addContents(Contents contents);
	public List<Contents> getAllContents();
	public Contents getContentsById(int id);
	public void updateContents(Contents contents);
	public void deleteContents(int id);

}
