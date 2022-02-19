package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cognizant.dao.ContentsDao;
import com.cognizant.entity.Contents;

@Controller
public class LearnerController {
	
	@Autowired
	Contents contents;
	
	@Autowired
	ContentsDao contentsDao;
	
	

}
