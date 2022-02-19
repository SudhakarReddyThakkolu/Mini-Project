package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Creator;

@Repository
public interface CreatorRepository extends JpaRepository<Creator, Integer>{
	
	@Query("select cr from Creator cr where cr.emailId=(:emailId) and cr.password=(:password)")
	Creator findByLoginData(String emailId, String password);

}
