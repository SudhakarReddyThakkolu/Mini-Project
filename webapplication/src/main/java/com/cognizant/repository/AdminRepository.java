package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query("select ad from Admin ad where ad.emailId=(:emailId) and ad.password=(:password)")
	Admin findByLoginData(String emailId, String password);
}
