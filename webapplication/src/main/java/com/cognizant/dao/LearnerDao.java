package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Learner;

@Service
public interface LearnerDao {
	public void addLearner(Learner learner);
	public List<Learner> getAllLearner();
	public Learner getLearnerById(int id);
	public void updateLearner(Learner learner);
	public void deleteLearner(int id);
	public Learner validateLearner(String emailId, String password);
	

}
