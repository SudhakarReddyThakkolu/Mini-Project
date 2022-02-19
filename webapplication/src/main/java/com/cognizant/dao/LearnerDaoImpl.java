package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Learner;
import com.cognizant.repository.LearnerRepository;

@Service 
public class LearnerDaoImpl implements LearnerDao {
	
    
    @Autowired
    LearnerRepository LearnerRepository; 

	@Override
	public void addLearner(Learner learner) {
       LearnerRepository.save(learner);
		
	}

	@Override
	public List<Learner> getAllLearner() {
		// TODO Auto-generated method stub
		List<Learner> learnerList = LearnerRepository.findAll();
		return learnerList;
	}

	@Override
	public Learner getLearnerById(int id) {
		// TODO Auto-generated method stub
		Learner learner1 = LearnerRepository.getById(id);
		return learner1;
	}

	@Override
	public void updateLearner(Learner learner) {
		// TODO Auto-generated method stub
		LearnerRepository.save(learner);
	}

	@Override
	public void deleteLearner(int id) {
		// TODO Auto-generated method stub
		LearnerRepository.deleteById(id);
		
	}

	@Override
	public Learner validateLearner(String emailId, String password) {
		// TODO Auto-generated method stub
		Learner learner1 = LearnerRepository.findByLoginData(emailId, password);
		return learner1;
	}
	
	

}
