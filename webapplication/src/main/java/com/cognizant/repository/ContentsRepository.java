package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Contents;

@Repository
public interface ContentsRepository extends JpaRepository<Contents, Integer> {

}
