package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Creator;

@Service
public interface CreatorDao {
	
	public void addCreator(Creator creator);
	public List<Creator> getAllCreator();
	public Creator getCreatorById(int id);
	public void updateCreator(Creator creator);
	public void deleteCreator(int id);
	public Creator validateCreator(Creator creator);

}
