package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Learner;

@Repository
public interface LearnerRepository extends JpaRepository<Learner, Integer> {
	@Query("select lr from Learner lr where lr.emailId=(:emailId) and lr.password=(:password)")
	Learner findByLoginData(String emailId, String password);

}
