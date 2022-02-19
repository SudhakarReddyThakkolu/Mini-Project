package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Admin;
import com.cognizant.repository.AdminRepository;

@Service
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	AdminRepository AdminRepository;

	@Override
	public void addAdmin(Admin admin) {
		AdminRepository.save(admin);
		
	}

	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> adminList = AdminRepository.findAll();
		return adminList;
	}

	@Override
	public Admin getAdminById(int id) {
		Admin admin = AdminRepository.getById(id);
		return admin;
	}

	@Override
	public void updateAdmin(Admin admin) {
		AdminRepository.save(admin);
		
	}

	@Override
	public void deleteAdmin(int id) {
		AdminRepository.deleteById(id);
		
	}
	
	@Override
	public Admin validateAdmin(Admin admin) {
		Admin admin1 = AdminRepository.findByLoginData(admin.getEmailId(), admin.getPassword());
		return admin1;
	}

	
}
