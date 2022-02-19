package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Contents;
import com.cognizant.repository.ContentsRepository;

@Service
public class ContentsDaoImpl implements ContentsDao{
	
	@Autowired
	ContentsRepository ContentsRepository;

	@Override
	public void addContents(Contents contents) {
		// TODO Auto-generated method stub
		ContentsRepository.save(contents);
		
		
	}

	@Override
	public List<Contents> getAllContents() {
		// TODO Auto-generated method stub
		List<Contents> contentList = ContentsRepository.findAll();
		return contentList;
	}

	@Override
	public Contents getContentsById(int id) {
		// TODO Auto-generated method stub
		Contents contents = ContentsRepository.getById(id);
		return contents;
	}

	@Override
	public void updateContents(Contents contents) {
		// TODO Auto-generated method stub
		ContentsRepository.save(contents);
		
	}

	@Override
	public void deleteContents(int id) {
		// TODO Auto-generated method stub
		ContentsRepository.deleteById(id);
	}
	

}
