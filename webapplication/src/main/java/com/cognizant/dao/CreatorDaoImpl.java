package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Creator;
import com.cognizant.repository.CreatorRepository;

@Service
public class CreatorDaoImpl implements CreatorDao{
	
	@Autowired
	CreatorRepository CreatorRepository;

	@Override
	public void addCreator(Creator creator) {
		CreatorRepository.save(creator);
		
	}

	@Override
	public List<Creator> getAllCreator() {
		// TODO Auto-generated method stub
		List<Creator> creatorList = CreatorRepository.findAll();
		return creatorList;
	}

	@Override
	public Creator getCreatorById(int id) {
		// TODO Auto-generated method stub
		Creator creator1 = CreatorRepository.getById(id);
		return creator1;
	}

	@Override
	public void updateCreator(Creator creator) {
		// TODO Auto-generated method stub
		CreatorRepository.save(creator);
		
	}

	@Override
	public void deleteCreator(int id) {
		// TODO Auto-generated method stub
		CreatorRepository.deleteById(id);
		
	}

	@Override
	public Creator validateCreator(Creator creator) {
		// TODO Auto-generated method stub
		Creator creator1 = CreatorRepository.findByLoginData(creator.getEmailId(), creator.getPassword());
		return creator1;
	}
	

}
