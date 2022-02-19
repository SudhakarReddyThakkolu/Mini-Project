package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Admin;

@Service
public interface AdminDao {
	
	public void addAdmin(Admin admin);
	public List<Admin> getAllAdmin();
	public Admin getAdminById(int id);
	public void updateAdmin(Admin admin);
	public void deleteAdmin(int admin);
	public Admin validateAdmin(Admin admin);

}
